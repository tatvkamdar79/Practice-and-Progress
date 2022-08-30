class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        g = p = m = 0
        for i in range(len(garbage) - 1, -1, -1):
            if g > 0 and p > 0 and m > 0:
                break
            if g == 0 and 'G' in garbage[i]:
                g = i
            if p == 0 and 'P' in garbage[i]:
                p = i
            if m == 0 and 'M' in garbage[i]:
                m = i
        
        # print(g, p, m)
        ans = 0
        for i in range(g + 1):
            ans += garbage[i].count('G')
            ans += travel[i] if i != g else 0
        for i in range(p + 1):
            ans += garbage[i].count('P')
            ans += travel[i] if i != p else 0
        for i in range(m + 1):
            ans += garbage[i].count('M')
            ans += travel[i] if i != m else 0
            
        return ans