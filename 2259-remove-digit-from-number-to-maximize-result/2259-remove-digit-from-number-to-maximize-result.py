class Solution:
    def removeDigit(self, s: str, digit: str) -> str:
        for i in range(len(s)-1):
            if s[i] == digit and s[i+1] > digit:
                return s[:i] + s[i+1:]
        for i in range(len(s)-1, -1, -1):
            if s[i] == digit:
                return s[:i] + s[i+1:]