class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> mp = new HashMap<>();
        for(String s : words)
            mp.put(s, 1);
        int ans = 0;
        for(String s : words){
            for(int i = 0; i < s.length(); i++){
                String prev = s.substring(0, i) + s.substring(i+1);
                if(mp.containsKey(prev)){
                    mp.put(s, Math.max(mp.get(prev) + 1, mp.get(s)));
                }
                ans = Math.max(ans, mp.get(s));
            }
        }
        return ans;
    }
    
}