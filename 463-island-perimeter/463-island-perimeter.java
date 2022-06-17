class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0, m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                p += 4 * grid[i][j];
                if (i > 0)  p -= grid[i][j]*grid[i-1][j];
                if (i < m-1)    p -= grid[i][j]*grid[i+1][j];
                if (j > 0)  p -= grid[i][j]*grid[i][j-1];
                if (j < n-1)    p -= grid[i][j]*grid[i][j+1];
            }
        }
        return p;
    }
}