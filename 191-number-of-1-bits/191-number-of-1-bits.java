public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            //This expression will make the least significant bit (LSB) as 0.
            //For eg -> 13 = 1101
            //          12 = 1100
            // will give ->  1000
            // Hence the Time complexity would also be optimized because it will
            // only check the number of 1's rather than going to every index.
            n = n & (n-1);
            count++;
        }
        return count;
        // int c = 0;
        // String tc = Integer.toBinaryString(n);
        // for(int i = 0; i < tc.length(); i++){
        //     if(tc.charAt(i) == '1') c+=1;
        // };
        // return c;
    }
}