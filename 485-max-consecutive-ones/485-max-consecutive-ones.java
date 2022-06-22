class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0, end = 0, ans = 0;
        while(start < nums.length && end < nums.length){
            if(nums[start] != 1){
                start++;
                continue;
            }
            if(nums[start] == 1){
                end = start + 1;
                int count = 1;
                while(end < nums.length && nums[end] == 1){
                    end++;
                    count++;
                }
                ans = Math.max(ans, count);
                start = end;
            }
        }
        return ans;
    }
}