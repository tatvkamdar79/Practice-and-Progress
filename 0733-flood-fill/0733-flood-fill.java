class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        image[sr][sc] = color;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        int[][] dirs = {{1, 0},{-1, 0},{0, 1},{0, -1}};
        int m = image.length, n = image[0].length;
        boolean[][] vis = new boolean[m][n];
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] curr = q.poll();
                for(int[] dir : dirs){
                    int x = curr[0] + dir[0];
                    int y = curr[1] + dir[1];
                    if(x >= 0 && x < m && y >= 0 && y < n && image[x][y] == original && !vis[x][y]){
                        image[x][y] = color;
                        q.add(new int[]{x, y});
                        vis[x][y] = true;
                    }
                }
            }
        }
        return image;
    }
}