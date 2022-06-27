class Solution {
    public int minPartitions(String n) {
        int res = 0;
        for(int i=9; i>=1; i--) {
            String ch = String.valueOf(i);
            if( n.contains(ch) ) {
                res = i;
                break;
            }
        }
        return res;
        // int ans = 0;
        // for(char c : n.toCharArray()){
        //     if(c == '9')    return 9;
        //     ans = Math.max(ans, c-'0');
        // }
        // return ans;
    }
}