class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()<1)   return 0;
        int[] mp = new int[256];
        int l = 0, r = 1, ans = 1;
        mp[s.charAt(l)]++;
        while(r < s.length()){
            mp[s.charAt(r)]++;
            if(mp[s.charAt(r)] > 1){
                while(l < r && mp[s.charAt(r)] != 1){
                    mp[s.charAt(l)]--;
                    l++;
                }
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
        
        
        
        
        
        
//         HashSet<Character> uniqueCharacters = new HashSet();
//         int start = 0, end = 0, maxLength = 0;
        
//         while (end < s.length()) {
//             if (uniqueCharacters.add(s.charAt(end))) {
//                 end++;
//                 maxLength = Math.max(maxLength, uniqueCharacters.size());
//             } else {
//                 uniqueCharacters.remove(s.charAt(start));
//                 start++;
//             }
//         }
//         return maxLength;
    }
}