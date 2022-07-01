class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return Collections.emptyList();
        int[] freq = new int[26];
        int[] f = new int[26];
        int p_len = p.length(), s_len = s.length();
        for(int i = 0; i < p_len; i++){
            freq[p.charAt(i)-'a']++;
            f[s.charAt(i) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        if(Arrays.equals(freq, f))  res.add(0);
        for(int i = p_len; i < s_len; i++){
            f[s.charAt(i - p_len) - 'a']--;
            f[s.charAt(i) - 'a']++;
            
            if(Arrays.equals(freq, f))
                res.add(i - p_len +1);
        }
        return res;
    }
}