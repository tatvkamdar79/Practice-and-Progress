class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[46];
        dp[1] = 1; dp[2] = 2;
        for(int i = 3; i < n+1; i++)    dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }
    
    // public static HashMap<Integer, Integer> mp = new HashMap<>();
    // public int rec(int x){
    //     if(mp.get(x) != null)   return mp.get(x);
    //     if(x <= 2){
    //         mp.put(x, x);
    //         return mp.get(x);
    //     }
    //     else{
    //         mp.put(x-1, rec(x-1));
    //         mp.put(x-2, rec(x-2));
    //         return mp.get(x-1) + mp.get(x-2);
    //     }
    // }
}