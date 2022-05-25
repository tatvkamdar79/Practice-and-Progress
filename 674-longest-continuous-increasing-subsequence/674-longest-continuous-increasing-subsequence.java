class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;  

        int max=1,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                if(count>max)
                    max=count;
                count=1; 
            }
            else
                count++;
        }
        return max<count ? count : max;
    }
}