class Solution:
    def longestBeautifulSubstring(self, word: str) -> int:
        if len(word) < 5:
            return 0
        ans = 0
        a = e = i = o = u = False
        idx = 0
        while idx < len(word):
            s = idx
            while idx < len(word) and word[idx] == 'a':
                idx += 1
                a = True
            while idx < len(word) and a and  word[idx] == 'e':
                idx += 1
                e = True
            while idx < len(word) and e and word[idx] == 'i':
                idx += 1
                i = True
            while idx < len(word) and i and word[idx] == 'o':
                idx += 1
                o = True
            while idx < len(word) and o and word[idx] == 'u':
                idx += 1
                u = True
            if u:
                ans = max(ans, idx-s)
            a = e = i = o = u = False
            if idx == s:
                idx += 1
        return ans