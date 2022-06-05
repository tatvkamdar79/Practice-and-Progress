class Solution {
    public int totalNQueens(int n) {
        return solve(n, 0, 0, 0, 0);
    }

    public int solve(int n, int row, int columns, int diagonals1, int diagonals2) {
        if (row == n) {
            return 1;
        } else {
            int count = 0;
            int availablePositions = ((1 << n) - 1) & (~(columns | diagonals1 | diagonals2));
            while (availablePositions != 0) {
                int position = availablePositions & (-availablePositions);
                availablePositions = availablePositions & (availablePositions - 1);
                count += solve(n, row + 1, columns | position, (diagonals1 | position) << 1, (diagonals2 | position) >> 1);
            }
            return count;
        }
    }
}
// class Solution {
//     public int totalNQueens(int n) {
//         Set<List<String>> res = new HashSet<>();
//         char[][] b = new char[n][n];
//         for(int i = 0; i < n; i++)  for(int j = 0; j < n; j++)  b[i][j] = '.';
//         rec(b, n, 0, res);
//         System.out.println(res);
//         return res.size();
//     }
//     public void rec(char[][] b, int c, int row, Set<List<String>> res){
//         if(row >= b.length && c == 0 && check(b)){
//             List<String> temp = new ArrayList<>();
//             for(int i = 0; i < b.length; i++){
//                 String str = "";
//                 for(int j = 0; j < b.length; j++){
//                     str += b[i][j];
//                 }
//                 temp.add(str);
//             }
//             res.add(temp);
//             // for(int i = 0; i < b.length; i++)   System.out.println(Arrays.toString(b[i]));
//             // System.out.println("\n");
//             return;
//         }
//         for(int col = 0; col < b.length; col++){
//             b[row][col] = 'Q';
//             if(check(b))    rec(b, c - 1, row + 1, res);
//             b[row][col] = '.';
//         }
//     }
//     public boolean check(char[][] b){
//         for(int i = 0; i < b.length; i++){
//             for(int j = 0; j < b.length; j++){
//                 if(b[i][j] == 'Q'){
//                     boolean rowCheck = false, colCheck = false, diagCheck = false;
//                     for(int col = 0; col < b.length; col++){
//                         if(col != j && b[i][col] == 'Q')    return false;
//                     }
//                     for(int row = 0; row < b.length; row++){
//                         if(row != i && b[row][j] == 'Q')    return false;
//                     }
//                     int row = i - 1, col = j - 1;
//                     //   this direction \ up
//                     while(row >= 0 && col >= 0){
//                         if(b[row][col] == 'Q')  return false;
//                         row--;
//                         col--;
//                     }
//                     // this direction \ down
//                     row = i + 1;
//                     col = j + 1;
//                     while(row < b.length && col < b.length){
//                         if(b[row][col] == 'Q')  return false;
//                         row++;
//                         col++;
//                     }
//                     row = i - 1;
//                     col = j + 1;
//                     while(row >= 0 && col < b.length){
//                         if(b[row][col] == 'Q')  return false;
//                         row--;
//                         col++;
//                     }
//                     row = i + 1;
//                     col = j - 1;
//                     while(row < b.length && col >= 0){
//                         if(b[row][col] == 'Q')  return false;
//                         row++;
//                         col--;
//                     }
//                 }
//             }
//         }
//         return true;
//     }
// }