class Solution:
    def countDaysTogether(self, aa: str, la: str, ab: str, lb: str) -> int:
        D = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        
        def helper(days):
            return int(days[-2:]) + sum(D[:int(days[:2]) - 1])
        
        return max(0, helper(min(la, lb)) - helper(max(aa, ab)) + 1)