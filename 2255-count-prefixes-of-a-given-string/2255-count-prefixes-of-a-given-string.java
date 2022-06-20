class Solution {
    public int countPrefixes(String[] words, String s) {
        int c = 0, slen = s.length();
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > slen)
                continue;
            boolean flag = true;
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) != s.charAt(j)){
                        flag = false;
                        break;
                }
            }
            if(flag)
                c++; 
        }
        return c;
    }
}