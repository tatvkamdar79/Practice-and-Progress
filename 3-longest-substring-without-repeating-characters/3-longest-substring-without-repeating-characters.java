class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()<1)   return 0;
        HashSet<Character> uniqueCharacters = new HashSet();
        int start = 0, end = 0, maxLength = 0;
        
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}