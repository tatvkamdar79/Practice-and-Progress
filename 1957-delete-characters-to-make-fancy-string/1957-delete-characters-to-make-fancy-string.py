class Solution:
    def makeFancyString(self, s: str) -> str:
        l = list(s)
        for i in range(len(l) - 2):
            if s[i]*3 == s[i:i+3]:
                l[i] = ''
        return ''.join(l)