class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if n == 0:
            return 1
        if n == 1:
            return 10
        
        ans = 10
        start = 9
        current = 9
        
        while(n > 1 and start > 0):
            current *= start
            start -= 1
            ans += current
            n -= 1
        return ans