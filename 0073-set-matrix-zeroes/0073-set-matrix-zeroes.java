class Solution {
  public void setZeroes(int[][] mat) {
    int col0 = 1;
    int m = mat.length, n = mat[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 0) {
          mat[i][0] = 0;
          if (j == 0) col0 = 0;
          else mat[0][j] = 0;
        }
      }
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if(mat[i][j] != 0) {
          if (mat[0][j] == 0 || mat[i][0] == 0)
            mat[i][j] = 0;
        }
      }
    }
    if(mat[0][0] == 0) for(int j = 0; j < n; j++) mat[0][j] = 0;
    if(col0 == 0) for(int i = 0; i < m; i++) mat[i][0] = 0;
  }
}
