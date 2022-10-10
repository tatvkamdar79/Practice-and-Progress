class Solution {
    public String breakPalindrome(String p) {
        int n = p.length();
        if(n == 1)
            return "";
        int i = 0, j = n - 1;
        boolean isA = true;
        while(i < j){
            if(p.charAt(i) != 'a'){
                return p.substring(0, i) + "a" + p.substring(i+1, n);
            }
            i++;
            j--;
        }
        return p.substring(0, n-1) + "b";
        
    }
}