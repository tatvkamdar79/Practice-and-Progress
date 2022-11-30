from collections import Counter as ctr
class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        c = ctr(arr)
        return len(set(c.values())) == len(set(c.keys()))
        # return len(c.values()) == len(set(c.values()))