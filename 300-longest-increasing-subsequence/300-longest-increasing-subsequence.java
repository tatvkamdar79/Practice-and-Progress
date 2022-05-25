class Solution {    
    public int lengthOfLIS(int[] nums) {
        int[] sub = new int[nums.length];
        int len = 0;
        
        for(int x : nums){
            int idx = Arrays.binarySearch(sub, 0, len, x);
            if(idx < 0) idx = -(idx + 1);
            sub[idx] = x;
            if(idx == len)    len++;
        }
        return len;
    }
}
    //     // O ( N ^ 2 )
    //     int[] dp = new int[nums.length];
    //     Arrays.fill(dp, 1);
    //     int ans = 1;
    //     for(int i = 0; i < nums.length; i++){
    //         int longest_so_far = 0;
    //         for(int j = 0; j < i; j++){
    //             if(nums[j] < nums[i])
    //                 longest_so_far = Math.max(longest_so_far, dp[j]);
    //         }
    //         dp[i] = 1 + longest_so_far;
    //         ans = Math.max(ans, dp[i]);
    //     }
    //     return ans;
    // }
// }