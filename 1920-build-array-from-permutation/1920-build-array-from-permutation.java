class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int [nums.length];
        permute( nums, ans, 0);
        return ans;
    }
    public void permute( int[] nums, int[] ans, int i ){
        if( i == nums.length ) return;
        ans[i] = nums[nums[i]];
        permute( nums, ans, (i+1));
    }
}