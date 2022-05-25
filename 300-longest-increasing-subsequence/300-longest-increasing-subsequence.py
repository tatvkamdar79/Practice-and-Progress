class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        dp = [1]*len(nums)
        
        for i in range(len(nums)):
            m = 0
            for j in range(i):
                if nums[j] < nums[i]:
                    m = max(m, dp[j])
            dp[i] = 1 + m
        # print(nums)
        # print(dp)
        return max(dp)