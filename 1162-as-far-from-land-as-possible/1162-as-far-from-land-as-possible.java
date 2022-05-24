class Solution {
    public int maxDistance(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < grid.length; i++)    
            for(int j = 0; j < grid[0].length; j++) 
                if(grid[i][j] == 1)
                    q.add(new int[]{i,j});
        
        if(q.size() == m * n || q.size() == 0)  return -1;
        
        int level = 0;
        
        int[][] check = new int[][]{{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int z = 0; z < size; z++){
                int[] idx = q.poll();
                int i = idx[0], j = idx[1];
                
                for(int a = 0; a < 4; a++){                    
                    int xi = i+check[a][0];
                    int yj = j+check[a][1];
                    if(0 <= xi && xi < m && 0 <= yj && yj < n && grid[xi][yj] == 0){
                        q.add(new int[]{xi, yj});
                        grid[xi][yj] = 1;
                    }
                }
            }
            level++;
        }
        return level-1;
    }
}