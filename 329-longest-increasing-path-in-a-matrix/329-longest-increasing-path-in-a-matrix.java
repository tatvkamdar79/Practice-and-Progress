class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int[][] cache = new int[matrix.length][matrix[0].length];
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int len = dfs(matrix, cache, i, j);
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
    
    private int dfs(int[][] matrix,
                    int[][] cache,
                    int i,
                    int j) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length) {
            return 0;
        }
        
        if (cache[i][j] != 0) {
            return cache[i][j];
        }
        int current = matrix[i][j];
        int length = 1;
        if (i > 0 && matrix[i - 1][j] > current) {
            length = Math.max(length, 1 + dfs(matrix, cache, i - 1, j));
        }
        
        if (i < matrix.length - 1 && matrix[i + 1][j] > current) {
            length = Math.max(length, 1 + dfs(matrix, cache, i + 1, j));
        }
        
        if (j > 0 && matrix[i][j - 1] > current) {
            length = Math.max(length, 1 + dfs(matrix, cache, i, j - 1));
        }
        
        if (j < matrix[i].length - 1 && matrix[i][j + 1] > current) {
            length = Math.max(length, 1 + dfs(matrix, cache, i, j + 1));
        }
        cache[i][j] = length;
        return length;
    }
}