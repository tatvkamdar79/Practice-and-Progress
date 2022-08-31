class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        ans = float('inf')
        i = 0
        while i <= len(blocks) - k:
            # print(blocks[i:i+k])
            ans = min(ans, k - blocks[i:i+k].count('B'))
            i += 1
        return ans