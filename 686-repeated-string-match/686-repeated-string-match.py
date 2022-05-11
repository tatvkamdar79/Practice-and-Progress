class Solution:
    def repeatedStringMatch(self, a: str, b: str) -> int:
        x = math.ceil(len(b)/len(a))
        if b in a*x:
            return x
        if b in a*(x+1):
            return x + 1
        return -1
            