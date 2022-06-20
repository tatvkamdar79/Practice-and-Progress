class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        # c = 0
        # for i in words:
        #     if s.find(i) == 0:
        #         c += 1
        # return c
        return len(list(filter(lambda w: s.startswith(w), words)))