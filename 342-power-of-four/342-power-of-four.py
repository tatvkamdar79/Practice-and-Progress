class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        b = bin(n)[2:]
        if b[0] == '1' and b.count('1') == 1 and b.count('0')%2 == 0:
            return True
        return False