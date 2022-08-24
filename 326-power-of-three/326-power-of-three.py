class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n > 0 and 3**19 % n == 0:
            return True
        return False