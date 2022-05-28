class Solution {
    public int[][] highestPeak(int[][] isWater) {
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < isWater.length; i++){
            for(int j = 0; j < isWater[0].length; j++){
                if(isWater[i][j] == 1){
                    isWater[i][j] = 0;
                    q.add(new int[]{i,j});
                }
                else    isWater[i][j] = -1;
            }
        }
        
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int height = 1;
        System.out.println(Arrays.deepToString(isWater));
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] temp = q.poll();
                int r = temp[0], c = temp[1];
                for(int i = 0; i < 4; i++){
                    int x = r + dirs[i][0];
                    int y = c + dirs[i][1];
                    if(x >= 0 && y >= 0 && x < isWater.length && y < isWater[0].length && isWater[x][y] == -1){
                        isWater[x][y] = height;
                        q.add(new int[]{x,y});
                    }
                }
            }
            height++;
        }
        return isWater;
    }
}