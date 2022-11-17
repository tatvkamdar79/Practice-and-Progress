class Solution:
    def computeArea(self, a, b, c, d, e, f, g, h):
        area1 = abs(a-c)*abs(b-d)
        area2 = abs(e-g)*abs(f-h)
        common = max(min(c,g) - max(a, e), 0) * max(min(d, h) - max(b, f), 0)
        return area1 + area2 - common