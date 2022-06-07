class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set = new HashSet<>();
        for(String s : nums)
            set.add(Integer.parseInt(s, 2));
        int len = nums[0].length();
        for(int i = 0; i < Math.pow(2, len); i++){
            if(!set.contains(i)){
                String ans = Integer.toBinaryString(i);
                if(ans.length() == len)
                    return ans;
                else
                    return "0".repeat(len-ans.length()) + ans;
            }
        }
        return "";
    }
}