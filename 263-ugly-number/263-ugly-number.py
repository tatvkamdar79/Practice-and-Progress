class Solution:
    def isUgly(self, n: int) -> bool:
        if n <= 0:
            return False
        if n <= 5:
            return True
        
        while n > 5:
            if n%2 !=0 and n%3 != 0 and n%5 != 0:
                return False
            
            if n%2 == 0:
                n = n // 2
            if n%3 == 0:
                n = n // 3
            if n%5 == 0:
                n = n // 5
        
        return True