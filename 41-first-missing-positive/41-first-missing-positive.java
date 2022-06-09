class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) nums[i] = 0;
        }
        
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            if(val > 0 && val <= nums.length){
                if(nums[val - 1] == 0)    nums[val - 1] = - (nums.length + 1);
                else    nums[val - 1] = - Math.abs(nums[val - 1]);
            }
        }
        
        for(int i = 1; i < nums.length + 1; i++){
            if(nums[i-1] >= 0)   return i;
        }
        
        return nums.length + 1;
        
        
        
        
        
        
        
        // int[] x = new int[nums.length + 1];
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > nums.length)   continue;
        //     else if(nums[i] > 0 && nums[i] <= nums.length)    x[nums[i] - 1] = 1;
        // }
        // for(int i = 0; i < x.length; i++){
        //     if(x[i] == 0)   return i + 1;
        // }
        // return nums.length + 1;
    }
}