class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int l = 0, r = 0;
        int ans = 0, sum = 0;
        
        while(l < nums.length && r < nums.length){
            
            if(!s.contains(nums[r])){
                
                sum += nums[r];
                ans = Math.max(ans, sum);
                s.add(nums[r++]);
            }else{
                
                sum -= nums[l];
                s.remove(nums[l++]);
            }
        }
        return ans;
    }
}