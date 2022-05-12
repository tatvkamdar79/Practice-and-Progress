class Solution:
    def kthSmallestPath(self, dest: List[int], k: int) -> str:
        v, h, res = dest[0], dest[1], ""
        while True:
            if k == 1:
                return res + "H"*h + "V"*v
            temp = comb(h + v - 1, v)
            if k <= temp:
                h -= 1
                res += "H"
            else:
                k -= temp
                res += "V"
                v -= 1
        return res