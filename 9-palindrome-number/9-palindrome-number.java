class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int revertedNumber = 0;
        
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
        
        // String s = Integer.toString(x);
        // if(s.length() < 1) return true;
        // int m = s.length()/2;
        // if(s.length()%2==0) return s.substring(0,m).equals(s.substring(m,s.length()));
        // return s.substring(0,m).equals(s.substring(m+1, s.length()));
    }
}