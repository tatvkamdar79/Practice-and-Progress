class Solution {
    public long zeroFilledSubarray(int[] nums){
        int n = nums.length;
        long ans = 0, x = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
                x++;
            else
                x = 0;
            ans += x;
        }
        return ans;
    }
}