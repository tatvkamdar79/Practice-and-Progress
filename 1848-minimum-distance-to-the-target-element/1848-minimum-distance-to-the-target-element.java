class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                if (Math.abs(i - start) < min)
                    min = Math.abs(i - start);
            }
        }
        return min;
    }
}