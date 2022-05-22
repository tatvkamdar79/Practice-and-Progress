class Solution {
    int len;
    public int countSubstrings(String s) {
        if(s.length() == 1) return 1;
        this.len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++){
            count += isPalindrome(s, i, i) + isPalindrome(s, i, i+1);
        }
        return count;
    }
    public int isPalindrome(String s, int start, int end){
        int palindromes = 0;
        while(start >= 0 && end < len && s.charAt(start--) == s.charAt(end++))  palindromes++;
        return palindromes;
    }
}