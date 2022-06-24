class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)    return nums[0];
        int val = nums[0], c = 1;
        for(int i : nums){
            if(i == val)
                c++;
            else
                c--;
            if(c == 0){
                val = i;
                c = 1;
            }
        }
        return val;
    }
}