class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int s = 0, e = n, i = 0;
        while(e < 2*n){
            ans[i] = nums[s++];
            ans[i+1] = nums[e++];
            i+=2;
        }
        return ans;
    }
}