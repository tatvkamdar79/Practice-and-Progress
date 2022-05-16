class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        start = 0
        ans = 0
        prod = 1
        
        if k <= 1:
            return 0
        
        for ind, val in enumerate(nums):
            prod *= val
            while prod >= k:
                prod //= nums[start]
                start += 1
            
            ans += ind - start + 1
        return ans