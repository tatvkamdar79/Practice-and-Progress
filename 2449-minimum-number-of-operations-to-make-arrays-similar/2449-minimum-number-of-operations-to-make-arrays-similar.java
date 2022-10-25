class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        int n = nums.length;
        Arrays.sort(nums);
        Arrays.sort(target);
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(target));
        int even = 0, odd = 0;
        long steps = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                while(even < n && target[even] % 2 != 0)
                    even++;
                steps += (long)((long)Math.abs(((long)target[even++] - (long)nums[i]))/2);
            }
            else{
                while(odd < n && target[odd] % 2 == 0)
                    odd++;
                steps += (long)((long)Math.abs(((long)target[odd++] - (long)nums[i]))/2);
            }
        }
        return steps/2;
    }
}