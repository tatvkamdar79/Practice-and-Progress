class Solution:
    def digitCount(self, num: str) -> bool:
        count = [0 for _ in range(10)]
        for i in num:
            count[int(i)] += 1
        for i in range(len(num)):
            if count[i] != int(num[i]):
                return False
        return True