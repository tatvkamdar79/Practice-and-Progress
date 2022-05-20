class Solution:
    def maxScore(self, l: List[int], k: int) -> int:
        s = 0
        N = len(l)
        res = 0
        for i in range(N-k, len(l)):
            res += l[i]
        s = res
        for i in range(k):
            s -= l[N-k+i]
            s += l[i]
            res = max(s, res)
        return res