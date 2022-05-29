class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        int req = nums.length / 3;
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            if(mp.get(nums[i]) > req && s.add(nums[i]))   res.add(nums[i]);
        }
        return res;
    }
}