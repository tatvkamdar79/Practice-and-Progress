class Solution {
    public boolean canChange(String start, String target) {
        char[] s = start.toCharArray();
        char[] t = target.toCharArray();
        int i = 0, j = 0;
        while(i < s.length && j < t.length){
            while(i < s.length && s[i] == '_')
                i++;
            while(j < t.length && t[j] == '_')
                j++;
            if(i < s.length && j < t.length && s[i] == 'L' && t[j] == 'L' && i >= j){
                i++;
                j++;
            }
            else if(i < s.length && j < t.length && s[i] == 'R' && t[j] == 'R' && i <= j){
                i++;
                j++;
            }
            else if(i == s.length && j == t.length){
                break;
            }
            else{
                return false;
            }
        }
        return true;
    }
}