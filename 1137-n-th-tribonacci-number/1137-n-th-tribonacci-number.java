class Solution {
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int[] x = new int[n+1];
        x[1] = x[2] = 1;
        for(int i = 3; i < n + 1; i++){
            x[i] = x[i-1] + x[i-2] + x[i-3];
        }
        return x[n];
    }
}