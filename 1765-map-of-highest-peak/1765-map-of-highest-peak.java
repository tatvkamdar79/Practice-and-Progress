class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int M = isWater.length;
        int N = isWater[0].length;

        int[][] ans = new int[M][N];
        for (int[] arr : ans) {
            Arrays.fill(arr, 2001); // 因为最远距离 = m + n <= 2000
        }

        // base case
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0; // 水域为0
                }
            }
        }

        // 从左上到右下
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (ans[i][j] != 0) {
                    if (i > 0) {
                        ans[i][j] = Math.min(ans[i - 1][j] + 1, ans[i][j]); // 上方
                    }
                    if (j > 0) {
                        ans[i][j] = Math.min(ans[i][j - 1] + 1, ans[i][j]); // 左方
                    }
                }
            }
        }

        // 从右下到左上
        for (int i = M - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (ans[i][j] != 0) {
                    if (i < M - 1) {
                        ans[i][j] = Math.min(ans[i + 1][j] + 1, ans[i][j]); // 右方
                    }
                    if (j < N - 1) {
                        ans[i][j] = Math.min(ans[i][j + 1] + 1, ans[i][j]); // 下方
                    }
                }
            }
        }
        return ans;
    }
//         Queue<int[]> q = new LinkedList<>();
//         for(int i = 0; i < isWater.length; i++){
//             for(int j = 0; j < isWater[0].length; j++){
//                 if(isWater[i][j] == 1){
//                     isWater[i][j] = 0;
//                     q.add(new int[]{i,j});
//                 }
//                 else    isWater[i][j] = -1;
//             }
//         }
        
//         int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
//         int height = 1;
//         System.out.println(Arrays.deepToString(isWater));
        
//         while(!q.isEmpty()){
//             int size = q.size();
//             while(size-- > 0){
//                 int[] temp = q.poll();
//                 int r = temp[0], c = temp[1];
//                 for(int i = 0; i < 4; i++){
//                     int x = r + dirs[i][0];
//                     int y = c + dirs[i][1];
//                     if(x >= 0 && y >= 0 && x < isWater.length && y < isWater[0].length && isWater[x][y] == -1){
//                         isWater[x][y] = height;
//                         q.add(new int[]{x,y});
//                     }
//                 }
//             }
//             height++;
//         }
//         return isWater;
//      }
}