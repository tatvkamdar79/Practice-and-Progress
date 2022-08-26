class Solution:
    def reorderedPowerOf2(self, n: int) -> bool:
        from collections import Counter
        digits = Counter(str(n))
        # for i in range(10):
        #     print(str(1 << i), int('0b1' + ('0')*i, 2))
        for i in range(32):
            if digits == Counter(str(1 << i)):
                return True
        return False