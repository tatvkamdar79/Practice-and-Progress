class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        from collections import Counter
        d = Counter(sorted(words))
        return [x for x, y in d.most_common()[:k]]