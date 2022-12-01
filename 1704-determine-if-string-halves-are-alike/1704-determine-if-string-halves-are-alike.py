from collections import Counter
class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        ans = 0
        f = Counter(s[:len(s)//2])
        for i in f.keys():
            if i in 'aeiouAEIOU':
                ans += f[i]
        f = Counter(s[len(s)//2:])
        for i in f.keys():
            if i in 'aeiouAEIOU':
                ans -= f[i]
        return ans == 0