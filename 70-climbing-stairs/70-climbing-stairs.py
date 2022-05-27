class Solution:
    def climbStairs(self, n: int) -> int:
        # RECURSION WITH MEMOIZATION
        
        # memo = {}
        # def rec(left):
        #     if left in memo:    return memo[left]
        #     if left == 0:   return 1
        #     if left < 0:    return 0
        #     memo[left] = rec(left - 1) + rec(left - 2)
        #     return memo[left]
        # rec(n)
        # print(memo)
        
        # DYNAMIC PROGRAMMING APPROACH
        
        dp = [0]*(46)
        dp[0] = 0
        dp[1] = 1
        dp[2] = 2
        for i in range(3, n+1):
            dp[i] = dp[i-1] + dp[i-2]
        return dp[n]