public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        String tc = Integer.toBinaryString(n);
        for(int i = 0; i < tc.length(); i++){
            if(tc.charAt(i) == '1') c+=1;
        };
        return c;
    }
}