from collections import defaultdict
class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        freq = [0]*k
        prefix, rem, count = 0, 0, 0
        freq[0] = 1
        for i in nums:
            prefix += i
            rem = prefix % k
            if rem < 0:
                rem += k
            count += freq[rem]
            freq[rem] += 1
        
        return count