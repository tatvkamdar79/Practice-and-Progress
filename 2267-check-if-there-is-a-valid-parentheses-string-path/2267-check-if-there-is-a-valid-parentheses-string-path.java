class Solution {
    boolean[][][] dp = new boolean[100][100][101];
    int m, n;
    public boolean hasValidPath(char[][] grid) {
        if(grid[0][0] == ')')
            return false;
        m = grid.length;
        n = grid[0].length;
        if(grid[m-1][n-1] == '(')
            return false;
        return dfs(grid, 0, 0, 0);
    }
    public boolean dfs(char[][] grid, int r, int c, int k){
        k += grid[r][c] == ')' ? -1 : 1;
        if(k < 0 || k > (m+n)/2 || dp[r][c][k])
            return false;
        dp[r][c][k] = true;
        if(r == m - 1 && c == n - 1 && k == 0)
            return true;
        
        if(r < m - 1 && dfs(grid, r + 1, c, k))
            return true;
        if(c < n - 1 && dfs(grid, r, c + 1, k))
            return true;
        return false;
    }
}