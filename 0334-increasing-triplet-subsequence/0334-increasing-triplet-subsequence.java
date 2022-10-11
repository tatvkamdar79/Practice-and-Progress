class Solution {
    public boolean increasingTriplet(int[] nums) {
        long a = Long.MAX_VALUE, b = Long.MAX_VALUE, c = Long.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < a){
                a = nums[i];
            }
            else if(nums[i] > a && nums[i] < b && a < b){
                b = nums[i];
            }
            else if(nums[i] > b && b < c){
                c = nums[i];
            }
        }
        if(a != Long.MAX_VALUE && b != Long.MAX_VALUE && c != Long.MAX_VALUE){
            return true;
        }
        return false;
    }
}