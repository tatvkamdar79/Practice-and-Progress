class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int c = 0;
        Map<String, Integer> mp = new HashMap<>();
        for(String w : words){
            mp.put(w, mp.getOrDefault(w, 0) + 1);
        }
        for(String w : mp.keySet())
            if(helper(s, w))
                c += mp.get(w);
        return c;
    }
    public boolean helper(String s, String t){
        int j = 0;
        for(int i = 0; i < s.length() && j < t.length(); i++){
            if(s.charAt(i) == t.charAt(j))
                j++;
        }
        return j == t.length();
    }
}