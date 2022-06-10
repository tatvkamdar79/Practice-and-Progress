class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l, r = 0, len(nums)
        def FirstAndLast(mid):
            first = last = mid
            while first > 0 and nums[first - 1] == target:
                first -= 1
            while last < len(nums) - 1 and nums[last + 1] == target:
                last += 1
            return [first, last]
            
            
        while l < r:
            mid = (l + r) // 2
            if nums[mid] == target:
                return FirstAndLast(mid)
            if nums[mid] > target:
                r = mid
            else:
                l = mid + 1
        return [-1,-1]