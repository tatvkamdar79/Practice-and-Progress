class Solution {
    public int minFallingPathSum(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                int left = j > 0 ? mat[i-1][j-1] : Integer.MAX_VALUE;
                int up = mat[i-1][j];
                int right = j < n - 1 ? mat[i-1][j+1] : Integer.MAX_VALUE;
                int minVal = Math.min(up, Math.min(left, right));
                mat[i][j] += minVal;
            }
        }
        // for(int[] i : mat)
        //     System.out.println(Arrays.toString(i));
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
            min = Math.min(min, mat[m-1][i]);
        return min;
    }
}