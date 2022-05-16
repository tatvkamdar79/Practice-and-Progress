class Solution {
public:
    int findTargetSumWays(vector<int>& nums, int target) {
        return helper(nums, target, nums.size()-1, 0);
    }
    int helper(vector<int> &nums, int target, int idx, int curr_sum){
        if(idx < 0 && curr_sum == target)   return 1;
        if(idx < 0) return 0;
        int pos = helper(nums, target, idx-1, curr_sum+nums[idx]);
        int neg = helper(nums, target, idx-1, curr_sum-nums[idx]);
        return pos + neg;
    }
};