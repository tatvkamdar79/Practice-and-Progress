class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        plusOne = int(''.join(map(str, digits))) + 1
        return list(map(int, list(str(plusOne))))