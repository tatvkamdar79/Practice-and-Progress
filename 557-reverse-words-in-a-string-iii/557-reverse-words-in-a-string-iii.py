class Solution:
    def reverseWords(self, s: str) -> str:
        reverse = lambda x : x[::-1]
        return ' '.join(list(map(reverse, s.split())))