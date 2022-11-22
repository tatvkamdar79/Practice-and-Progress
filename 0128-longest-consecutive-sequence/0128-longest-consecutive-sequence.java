class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        int ans = 1;
        Set<Integer> s = new HashSet<>();
        for(int i : nums)   s.add(i);
        for(int i : nums){
            if(s.contains(i-1))
                continue;
            else{
                int curr = i, c = 1;
                while(s.contains(++curr))
                    c++;
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
}