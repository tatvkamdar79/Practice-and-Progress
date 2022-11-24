class Solution {
    public int[][] dirs = {{1, 0},{-1, 0},{0, 1},{0, -1}};
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] check = new boolean[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == word.charAt(0)){
                    check[i][j] = true;
                    if(find(board, check, word, 1, i, j)){
                        return true;
                    }
                    check[i][j] = false;
                }
            }
        return false;
    }
    public boolean find(char[][] board, boolean[][] check, String word, int idx, int i, int j){
        if(idx == word.length())
            return true;
        for(int[] dir : dirs){
            int x = i + dir[0];
            int y = j + dir[1];
            if(x < board.length && x >= 0 && y < board[0].length && y >= 0 && !check[x][y] && board[x][y] == word.charAt(idx)){
                check[x][y] = true;
                if(find(board, check, word, idx+1, x, y))
                    return true;
                check[x][y] = false;
            }
        }
        return false;
    }
}