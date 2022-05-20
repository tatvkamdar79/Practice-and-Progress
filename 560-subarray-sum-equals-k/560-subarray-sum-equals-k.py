class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = {}
        d[0] = 1
        s = 0
        c = 0
        for i in range(len(nums)):
            s += nums[i]
            if s - k in d:
                c += d[s-k]
            d[s] = 1 if s not in d else d[s] + 1
        return c