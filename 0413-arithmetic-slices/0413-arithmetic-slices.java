class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length, ans = 0;
        for(int i = 0; i < n - 2; i++){
            int first = nums[i], second = nums[i+1], third = nums[i+2];
            int diff = second - first;
            if(third - second == diff){
                // System.out.print(first + ", " + second + ", " + third + " -> ");
                ans++;
                for(int j = i + 3; j < n; j++){
                    if(nums[j] - nums[j-1] != diff)
                        break;
                    ans++;
                }
                // System.out.println();
            }
        }
        return ans;
    }
}