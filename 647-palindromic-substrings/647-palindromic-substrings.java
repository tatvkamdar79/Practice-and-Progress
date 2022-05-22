class Solution {
    public int countSubstrings(String str) {
        char[] s = str.toCharArray();
        int len = s.length;
        int count = 0;
        for(int i = 0; i < len; i++){
            for(int start = i, end = i; start >= 0 && end < len && s[start--] == s[end++]; )   count++;
            for(int start = i, end = i+1; start >= 0 && end < len && s[start--] == s[end++]; )   count++;
        }
        return count;
    }
}