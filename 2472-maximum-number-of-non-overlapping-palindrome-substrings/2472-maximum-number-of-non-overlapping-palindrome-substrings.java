class Solution {
    public int maxPalindromes(String s, int k) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                int len = j - i + 1;
                if(len > k + 1) break;
                if(len >= k && isPal(s, i, j)){
                    ans++;
                    i = j;
                    break;
                }
            }
        }
        return ans;
    }
    public boolean isPal(String s, int beg, int end){
        StringBuilder sb = new StringBuilder(s.substring(beg, end+1));
        return sb.reverse().toString().equals(s.substring(beg, end+1));
    }
}