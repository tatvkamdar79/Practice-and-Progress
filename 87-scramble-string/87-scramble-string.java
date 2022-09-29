class Solution {
    Map<String, Boolean> mp = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(mp.containsKey(s1 + s2)) 
            return mp.get(s1 + s2);
        if(s1.length() != s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        int[] letters = new int[26];
        int n = s1.length();
        for(int i = 0; i < n; i++){
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }
        for(int i : letters)
            if(i != 0)
                return false;
        for(int i = 1; i < n; i++){
            if(isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))){
                mp.put(s1.substring(0, i) + s2.substring(0, i), true);
                mp.put(s1.substring(i) + s2.substring(i), true);
                return true;
            }
            if(isScramble(s1.substring(0, i), s2.substring(n-i)) && isScramble(s1.substring(i), s2.substring(0, n-i))){
                mp.put(s1.substring(0, i) + s2.substring(n-i), true);
                mp.put(s1.substring(i) + s2.substring(0, n-i), true);
                return true;
            }
        }
        mp.put(s1+s2, false);
        return false;
    }
}