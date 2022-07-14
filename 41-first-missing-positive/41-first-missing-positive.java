class Solution {
    public void swap(int a, int b, int[] nums){
        int x = nums[a];
        nums[a] = nums[b];
        nums[b] = x;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length, i = 0;
        while(i < n){
            if(nums[i] == i + 1 || nums[i] <= 0 || nums[i] > n) i++;
            else if(nums[nums[i] - 1] != nums[i])   swap(nums[i] - 1, i, nums);
            else    i++;
        }
        i = 0;
        while(i < nums.length && nums[i] == i+1) i++;
        return i+1;
        
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