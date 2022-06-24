public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return (int)Integer.toBinaryString(n).chars().filter(a -> a == '1').count();
        
        // int count = 0;
        // while(n != 0) {
        //     n = n & (n-1);
        //     count++;
        // }
        // return count;
        
        // int c = 0;
        // String tc = Integer.toBinaryString(n);
        // for(int i = 0; i < tc.length(); i++){
        //     if(tc.charAt(i) == '1') c+=1;
        // };
        // return c;
    }
}