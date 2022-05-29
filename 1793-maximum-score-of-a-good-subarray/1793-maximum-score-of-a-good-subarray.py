class Solution:
    def maximumScore(self, nums: List[int], k: int) -> int:
        l = r = k
        min_so_far = nums[k]
        ans = nums[k]
        
        while l > 0 or r < len(nums) - 1:
            if l > 0 and r < len(nums) - 1:
                if nums[l-1] > nums[r+1]:
                    l -= 1
                    min_so_far = min(min_so_far, nums[l])
                else:
                    r += 1
                    min_so_far = min(min_so_far, nums[r])
            elif l > 0:
                l -= 1
                min_so_far = min(min_so_far, nums[l])
            else:
                r += 1
                min_so_far = min(min_so_far, nums[r])
            
            ans  = max(ans, min_so_far * (r - l + 1))
        
        return ans