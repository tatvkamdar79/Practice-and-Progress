class Solution {
    public int uniquePaths(int m, int n) {
        return traverse(m , n);
    }
    
    public static HashMap<String, Integer> memo = new HashMap<>();
    
    public int traverse(int m, int n){
        String key = Integer.toString(m)+","+Integer.toString(n);
        if(memo.get(key) != null)   return memo.get(key);
        if(m == 0 || n == 0){
            memo.put(key, 0);
            return memo.get(key);
        }
        else if(m == 1 || n == 1){
            memo.put(key, 1);
            return 1;
        } 
        else{
            String down = Integer.toString(m - 1) + "," + Integer.toString(n);
            String right = Integer.toString(m) + "," + Integer.toString(n - 1);
            memo.put(down, traverse(m-1, n));
            memo.put(right, traverse(m, n-1));
            return memo.get(right) + memo.get(down);
        }
    }
}