class Solution {
    public String reverseWords(String s) {
        String[] l = s.split(" ");
        for(int i = 0; i < l.length; i++)
            l[i] = new StringBuilder(l[i]).reverse().toString();
        String ans = l[0];
        for(int i = 1; i < l.length; i++)
            ans += " " + l[i];
        return ans;
    }
}