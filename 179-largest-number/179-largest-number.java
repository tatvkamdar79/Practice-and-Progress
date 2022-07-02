class Solution {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        StringBuilder sb = new StringBuilder();
        if(s[0].charAt(0) == '0')
			return "0";
        for(String str : s)
            sb.append(str);
        return sb.toString();
    }
}