class Solution {
    public int longestContinuousSubstring(String s) {
        int m = 0, c = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i)-'a' == s.charAt(i-1)-'a'+1){
                m++;
            }
            else{
                c = Math.max(c, m+1);
                m = 0;
            }
        }
        return Math.max(c, m+1);
    }
}