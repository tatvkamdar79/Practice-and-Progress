class Solution {
    public void solve(char[][] board) {
        
        if(board.length < 3)    return;
        
        for(int i = 0; i < board.length; i++){
            if(board[i][0] == 'O')
                dfs(board, i, 0);
            if(board[i][board[i].length - 1] == 'O')
                dfs(board, i, board[i].length - 1);
        }
        
        for(int j = 0; j < board[0].length; j++){
            if(board[0][j] == 'O')
                dfs(board, 0, j);
            if(board[board.length - 1][j] == 'O')
                dfs(board, board.length - 1, j);
        }
        
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
        
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                if(board[i][j] == '#')
                    board[i][j] = 'O';
    }
    
    public void dfs(char[][] board, int i, int j){
        if(i > board.length - 1 || i < 0 || j > board[0].length - 1 || j < 0 || board[i][j] != 'O')
            return;
        
        board[i][j] = '#';
        
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }
}