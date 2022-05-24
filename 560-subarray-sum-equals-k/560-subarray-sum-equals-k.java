class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(mp.containsKey(sum - k)){
                count += mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}