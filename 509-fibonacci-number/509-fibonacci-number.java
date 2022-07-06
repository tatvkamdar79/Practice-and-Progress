class Solution {
    public int fib(int n) {
        if(n == 0)
            return 0;
        int[] memo = new int[]{0, 1};
        for(int i = 2; i < n + 1; i++)
            memo = new int[]{memo[1], memo[1] + memo[0]};

        return memo[1];
    }
}