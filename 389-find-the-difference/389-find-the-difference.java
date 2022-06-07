class Solution {
    public char findTheDifference(String s, String t) {
        int[] ss = new int[26];
        int[] tt = new int[26];
        for(char c : s.toCharArray())
            ss[c-'a']++;
        for(char c : t.toCharArray())
            tt[c-'a']++;
        for(int i = 0; i < 26; i++){
            if(tt[i] - 1 == ss[i])
                return (char)(97+i);
        }
        return ' ';
    }
}