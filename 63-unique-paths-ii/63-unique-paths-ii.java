class Solution {
    public int uniquePathsWithObstacles(int[][] OG) {
        if(OG == null || OG.length == 0)    return 0;
        if(OG[0][0] == 1)   return 0;
        int[][] dp = new int[OG.length][OG[0].length];
        dp[0][0] = 1;
        for(int i = 0; i < OG.length; i++) {
            for(int j = 0; j < OG[i].length; j++) {
                if(OG[i][j] == 1 || (i == 0 && j == 0)) continue;
                int sum = 0;
                if(i - 1 >= 0)  sum += dp[i-1][j];
                if(j - 1 >= 0)  sum += dp[i][j-1];
                dp[i][j] = sum;
            }
        }
        return dp[OG.length-1][OG[0].length-1];
    }
}