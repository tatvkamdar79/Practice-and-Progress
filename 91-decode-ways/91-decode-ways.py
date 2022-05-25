class Solution:
    def numDecodings(self, s: str) -> int:
        if s[0] == '0':
            return 0
        if '00' in s:
            return 0
        
        dp = [0]*len(s)
        i = 1
        dp[0] = 1
        
        while i < len(s):
            if s[i] == '0':
                res = dp[i-1]
                if int(s[i-1:i+1]) <= 26:
                    dp[i] = dp[i-2] if i > 1 else 1
                    i += 1
                    continue
                else:
                    return 0
            dp[i] = dp[i-1]
            if s[i-1] != '0' and int(s[i-1:i+1]) <= 26:
                dp[i] += dp[i-2] if i > 1 else 1
            i += 1
        
        return dp[-1]