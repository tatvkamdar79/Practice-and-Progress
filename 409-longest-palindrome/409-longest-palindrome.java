class Solution {
    public int longestPalindrome(String s) {
        // char c = 'a';
        int count = 0;
        int[] l = new int[52];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z')    l[c-'a']++;
            else    l[c - 'A' + 26]++;
        }
        
        for(int i=0;i<l.length;i++){
            count += l[i]/2;
        }
        
        count = count*2;
        return Math.min(s.length(), count+1);        
        
        
//         My Original Code
//         HashMap<String, Integer> mp = new HashMap<>();
        
//         for(int i=0;i<s.length();i++){
//             if(mp.containsKey(s.substring(i,i+1)))    mp.replace(s.substring(i,i+1), mp.get(s.substring(i,i+1))+1);
//             else    mp.put(s.substring(i,i+1), 1);
//         }
//         System.out.println(mp);
        
//         List<Integer> l = new ArrayList<Integer>(mp.values());
        
//         int c = 0;
        
//         for(int i=0;i<l.size();i++){
//             c += l.get(i)/2;
//         }        
//         return Math.min(s.length(),c*2+1);
    }
}