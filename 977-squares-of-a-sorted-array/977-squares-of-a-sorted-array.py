class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        lo, hi, res = 0, len(nums) - 1, [0]*len(nums)
        for i in range(len(nums) - 1, -1, -1):
            if abs(nums[lo]) >= abs(nums[hi]):
                res[i] = (nums[lo] * nums[lo])
                lo += 1
            else:
                res[i] = (nums[hi] * nums[hi])
                hi -= 1
        return res