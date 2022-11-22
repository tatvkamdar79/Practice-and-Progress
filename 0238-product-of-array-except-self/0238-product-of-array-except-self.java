class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int mul = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                zero++;
            else
                mul *= nums[i];
            if(zero > 1)
                return new int[nums.length];
        }
        if(zero == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0)
                    nums[i] = mul;
                else
                    nums[i] = 0;
            }
            return nums;
        }
        for(int i = 0; i < nums.length; i++)
            nums[i] = mul/nums[i];
        return nums;
    }
}