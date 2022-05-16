class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if(mat == null || mat.length == 0 || mat[0].length == 0)    return false;
        if(mat.length == 1) return binarySearch(mat, 0, target);
        if(mat.length == 1 && mat[0].length == 1)   return mat[0][0] == target;
        int n = mat[0].length - 1;
        int start = 0, end = mat.length - 1;
        while(start < end) {
            int mid = (start + end)/2;
            if(mat[mid][n] == target)   return true;
            else if(mat[mid][n] > target)   end = mid;
            else    start = mid + 1;
        }
        
        return binarySearch(mat, start, target) || binarySearch(mat, end, target);
    }
    
    public boolean binarySearch(int[][] mat, int row, int target) {
        int s = 0, e = mat[row].length;
        while(s < e) {
            int mid = (s+ e)/2;
            if(mat[row][mid] == target)   return true;
            if(mat[row][mid] > target)  e = mid;
            else    s = mid + 1;
        }
        return false;
    }
//         int r = 0, c = mat[0].length-1;
        
//         while(r<mat.length && c>=0){
//             if(mat[r][c]==target)    return true;
//             else if(mat[r][c]<target)    r++;
//             else    c--;
//         }
//         return false;
//     }
}