class Solution {
    public int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m+1][n+1][strs.length];
        for(int i = 0; i < m+1; i++)    for(int j = 0; j < n+1; j++)    for(int k = 0; k < strs.length; k++)    dp[i][j][k] = -1;
        return rec(strs, m, n, 0);
    }
    public int rec(String[] strs, int zeros, int ones, int idx){
        if(idx == strs.length){
            return 0;
        }
        if(dp[zeros][ones][idx] != -1)  return dp[zeros][ones][idx];
        
        int nz = (int)strs[idx].chars().filter(x -> x == '0').count();
        int no = strs[idx].length() - nz;
        if(nz <= zeros && no <= ones){
            dp[zeros][ones][idx] = Math.max(1 + rec(strs, zeros-nz, ones-no, idx+1), rec(strs, zeros, ones, idx+1));
            return dp[zeros][ones][idx];
        }
        dp[zeros][ones][idx] = rec(strs, zeros, ones, idx+1);
        return dp[zeros][ones][idx];
    }
}