class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length && i < nums.length && i <= j){
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            i++;
            if(i < nums.length && j < nums.length){
                nums[i] = nums[j];
            }
        }
        return i;
    }
}