class Solution {
    public int numberOfSteps(int num) {
        int count = 1;
        if(num == 0){return 0;}
        if( num / 2== 0 || num - 1 == 0){return count;}
        
        if(num % 2 == 0){ return count + numberOfSteps(num/2);}
        
        return count + numberOfSteps(num-1);
        // String s = Integer.toBinaryString(num);
        // int zeros = (int)s.chars().filter(a -> a == '0').count();
        // int ones = s.length() - zeros;
        // // System.out.println(ones);
        // return ones*2 + zeros - 1;
    }
}