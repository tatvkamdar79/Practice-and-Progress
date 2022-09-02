class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] mp = new int[s.length() + 1];
        for(int[] shift : shifts){
            int beg = shift[0];
            int end = shift[1] + 1;
            int dir = shift[2] == 1 ? 1 : -1;
            mp[beg] += dir;
            mp[end] -= dir;
        }
        int prefix = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            prefix += mp[i];
            char c = s.charAt(i);
            int change = (c - 'a' + prefix)%26;
            while(change < 0)
                change += 26;
            sb.append((char)('a' + change));
        }
        return sb.toString();
    }
}