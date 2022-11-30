class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length, ans = 0;
        int[] dp = new int[n];
        for(int i = 1; i < n - 1; i++){
            if(nums[i] - nums[i-1] == nums[i+1] - nums[i])
                dp[i] = dp[i-1] + 1;
            ans += dp[i];
        }
        return ans;
    }
}