class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0, j = n - 1;
        for(int idx = n - 1; idx >= 0; idx--){
            if(Math.abs(nums[i]) > Math.abs(nums[j]))
                ans[idx] = nums[i] * nums[i++];
            else
                ans[idx] = nums[j] * nums[j--];
        }
        return ans;
    }
}