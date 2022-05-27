class Solution:
    def getMaximumConsecutive(self, coins: List[int]) -> int:
        res = 1
        coins.sort()
        for c in coins:
            if c > res:
                return res
            res += c
        return res