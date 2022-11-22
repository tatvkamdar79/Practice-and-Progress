class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int sum = 0, ans = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int find = sum - k;
            if(mp.containsKey(find)){
                ans += mp.get(find);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}