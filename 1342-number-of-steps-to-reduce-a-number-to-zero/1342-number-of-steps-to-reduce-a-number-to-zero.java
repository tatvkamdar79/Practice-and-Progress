class Solution {
    public int numberOfSteps(int num) {
        String s = Integer.toBinaryString(num);
        int zeros = (int)s.chars().filter(a -> a == '0').count();
        int ones = s.length() - zeros;
        // System.out.println(ones);
        return ones*2 + zeros - 1;
    }
}