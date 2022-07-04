class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i : nums)
            res[i] = nums[nums[i]];
        return res;
    }
}