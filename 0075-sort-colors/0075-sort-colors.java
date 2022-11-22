class Solution {
    public void sortColors(int[] nums) {
        int[] ans = new int[3];
        for(int i : nums)
            ++ans[i];
        int c = 0, i = 0;
        // System.out.println(Arrays.toString(ans));
        while(ans[c]-- > 0)
            nums[i++] = 0;
        ++c;
        while(ans[c]-- > 0)
            nums[i++] = 1;
        ++c;
        while(ans[c]-- > 0)
            nums[i++] = 2;
    }
}