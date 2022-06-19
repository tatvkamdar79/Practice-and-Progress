class Solution:
    def greatestLetter(self, s: str) -> str:
        upper = [0]*26
        lower = [0]*26
        for i in s:
            if 65 <= ord(i) < 65+26:
                upper[ord(i)-65] += 1
            else:
                lower[ord(i)-97] += 1
        for i in range(25, -1, -1):
            if lower[i] > 0 and upper[i] > 0:
                return chr(65+i)
        return ''