class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int j = i + 1, k = nums.length - 1;
            int contra = -nums[i];
            while(j < k){
                int sum = nums[j] + nums[k];
                if(sum == contra){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                }
                if(sum > contra)
                    k--;
                else
                    j++;
            }
        }
        return new ArrayList<>(ans);
    }
}