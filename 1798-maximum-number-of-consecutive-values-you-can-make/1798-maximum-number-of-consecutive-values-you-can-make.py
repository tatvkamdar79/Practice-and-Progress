class Solution:
    def getMaximumConsecutive(self, coins: List[int]) -> int:
        coins.sort()
        count = 1
        for i in range(len(coins)):
            if coins[i] <= count:
                count += coins[i]
            else:
                break
        return count