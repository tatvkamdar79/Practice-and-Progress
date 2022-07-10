class Solution {
    public int partitionDisjoint(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int n = nums.length;
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        int min = nums[0], max = nums[nums.length - 1];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], nums[i]);
            right[n-1-i] = Math.min(right[n-i], nums[n-1-i]);
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        for(int i=1;i<n;i++){
            if(left[i-1]<=right[i]) return i;
        }
        return n-1;
    }
}