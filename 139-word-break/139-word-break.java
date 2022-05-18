class Solution {
    Boolean[] dp;

    private boolean wordBreak(String s, List<String> wordDict, int i) {
        if(i >= s.length()) return true;
        if(dp[i] != null) return dp[i];
        
        for(String word: wordDict) {
            if(s.startsWith(word, i) && wordBreak(s, wordDict, i + word.length())) {
                dp[i] = true;
                return true;
            }
                
        }
        
        dp[i] = false;
        return false;
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        this.dp = new Boolean[s.length()];
        return wordBreak(s, wordDict, 0);
    }
}