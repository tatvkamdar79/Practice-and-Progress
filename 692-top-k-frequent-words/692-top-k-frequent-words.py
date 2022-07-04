class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        from collections import Counter
        c = Counter(words)
        return sorted(c, key=lambda x: (-c[x], x))[:k]