class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        from collections import defaultdict
        d = defaultdict(int)
        d[0] = 1
        ans = 0
        rs = 0
        for i in nums:
            rs += i
            val = rs - k
            if val in d:
                ans += d[val]
            if rs in d:
                d[rs] += 1
            else:
                d[rs] = 1
        return ans