class Solution:
    def reachNumber(self, target: int) -> int:
        target = abs(target)
        n = int(math.ceil((math.sqrt(8 * target + 1) - 1) / 2)) # solve inequation: n * (n + 1) / 2 >= target
        d = n * (1 + n) // 2 - target
        if d & 1 == 0:
            return n
        else:
            return n + (0 if n&1 == 0 else 1) + 1