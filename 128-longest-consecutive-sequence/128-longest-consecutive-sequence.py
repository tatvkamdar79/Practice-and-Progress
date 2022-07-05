class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if nums == []:
            return 0
        max_seq = 1
        s = set(nums)
        for i in nums:
            if i - 1 not in s:
                streak = 1
                curr = i
                while curr + 1 in s:
                    curr += 1
                    streak += 1
                max_seq = max(max_seq, streak)
        return max_seq