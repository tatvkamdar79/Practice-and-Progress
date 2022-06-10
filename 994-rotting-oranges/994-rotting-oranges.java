class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length, fresh_oranges = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1)
                    fresh_oranges++;
                else if(grid[i][j] == 2)
                    q.offer(new int[]{i, j});
            }
        }
        
        if(fresh_oranges == 0)  return 0;
        
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        int minutes = 0;
        while(!q.isEmpty()){
            minutes++;
            int size = q.size();
            while(size-- > 0){
                int[] cell = q.poll();
                for(int[] d : dirs){
                    int x = cell[0] + d[0];
                    int y = cell[1] + d[1];
                    if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    grid[x][y] = 2;
                    q.add(new int[]{x, y});
                    fresh_oranges--;
                }
            }
            if(fresh_oranges == 0)
                return minutes;
        }
        
        if(fresh_oranges == 0)
            return minutes;
        
        return -1;
    }
}