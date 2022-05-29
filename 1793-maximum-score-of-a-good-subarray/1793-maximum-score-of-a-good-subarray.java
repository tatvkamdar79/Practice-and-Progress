class Solution {
    public int maximumScore(int[] nums, int k) {
        int l = k, r = k;
        int min_so_far = nums[k];
        int ans = nums[k];
        
        while(l > 0 || r < nums.length - 1){
            if(l > 0 && r < nums.length - 1){
                if(nums[l-1] > nums[r+1]){
                    l -= 1;
                    min_so_far = Math.min(min_so_far, nums[l]);
                }
                else{
                    r += 1;
                    min_so_far = Math.min(min_so_far, nums[r]);
                }
            }
            else if(l > 0){
                l -= 1;
                min_so_far = Math.min(min_so_far, nums[l]);
            }
            else{
                r += 1;
                min_so_far = Math.min(min_so_far, nums[r]);
            }
            
            ans = Math.max(ans, min_so_far * (r - l + 1));
        }
        return ans;
    }
}