class Solution {
    public String removeDigit(String s, char digit) {
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == digit && s.charAt(i+1) > digit)
                return s.substring(0, i) + s.substring(i+1, s.length());
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == digit)
                return s.substring(0, i) + s.substring(i+1, s.length());
        }
        return "";
    }
}