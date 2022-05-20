class Solution {
    public String largestGoodInteger(String num) {
        char[] n = num.toCharArray();
        char[] ans = {' ', ' ', ' '};
        for(int i = 0; i < n.length - 2; i++){
            if(n[i] == n[i+1] && n[i+1] == n[i+2] && n[i] > ans[0]){
                ans[0] = n[i];
                ans[1] = n[i];
                ans[2] = n[i];
            }
        }
        return ans[0] == ' ' ? "" : new String(ans);
    }
}