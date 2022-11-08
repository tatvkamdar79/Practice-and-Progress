class Solution {
    public int[][] dp;
    public int maxSatisfaction(int[] s) {
        
        Arrays.sort(s);
        
        dp = new int[s.length+1][s.length+1];
        
        for(int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
        
        return rec(s, 0, 1);
    }
    
    public int rec(int[] s, int idx, int time){
        
        if(idx == s.length)
            return 0;
        
        if(dp[idx][time] != -1)
            return dp[idx][time];
        
        int inc = s[idx]*time + rec(s, idx+1, time+1);
        int nic = 0 + rec(s, idx+1, time);
        
        
        
        return dp[idx][time] = Math.max(inc, nic);
    }
}