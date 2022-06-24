class Solution:
    def longestPalindrome(self, s: str) -> int:
        l = [0]*128
        for i in s:
            l[ord(i)] += 1
        c, odd = 0, False
        for i in l:
            c += i
            if i % 2 != 0:
                c -= 1
                odd = odd or True
        return c + (1 if odd else 0)