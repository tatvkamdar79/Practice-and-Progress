class Solution:
    def canJump(self, nums: List[int]) -> bool:
        last_reachable = len(nums) - 1
        for i in range(len(nums) - 1, -1, -1):
            if nums[i] + i >= last_reachable:
                last_reachable = i
        return last_reachable == 0