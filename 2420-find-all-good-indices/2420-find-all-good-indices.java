class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();
        int[] left = new int[nums.length], right = new int[nums.length];
        Arrays.fill(left, 1);        Arrays.fill(right, 1);

        left[0] = 1;
        right[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                left[i] = left[i-1]+1;
            }
            
        }
        for(int i = nums.length - 2; i > 0; i--){
            if(nums[i] <= nums[i+1])
                right[i] = right[i+1]+1;
            
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        for(int i = 1; i < nums.length - 1; i++){
            if(left[i-1] >= k && right[i+1] >= k)
                l.add(i);
        }
        return l;
    }
}