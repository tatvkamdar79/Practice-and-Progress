class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!seen.add(board[i][j] + "at row" + i) ||
                       !seen.add(board[i][j] + "at col" + j) ||
                       !seen.add(board[i][j] + "in box" + i/3 + "," + j/3)) return false;
                }
            }
        }
        return true;
    }
}