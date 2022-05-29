class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] < max && nums[i] > min)
                count++;
        return count;
        // Arrays.sort(nums);
        // int count = 0;
        // for(int i = 1; i < nums.length - 1; i++){
        //     int l = i - 1, r = i + 1;
        //     while(l > -1 && r < nums.length){
        //         if(nums[l] < nums[i] && nums[r] > nums[i]){
        //             count++;
        //             break;
        //         }
        //         if(nums[l] == nums[i])  l--;
        //         if(nums[r] == nums[i])  r++;
        //     }
        // }
        // return count;
    }
}