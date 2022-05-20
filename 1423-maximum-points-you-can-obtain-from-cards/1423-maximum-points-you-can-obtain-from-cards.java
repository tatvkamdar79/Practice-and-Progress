class Solution {
    public int maxScore(int[] l, int k) {
        int s = 0;
        int N = l.length;
        int res = 0;
        for(int i = N-k; i < N; i++){
                res += l[i];
            }
        s = res;
        for(int i = 0; i < k; i++){
                s -= l[N-k+i];
                s += l[i];
                res = Math.max(s, res);
            }
        return res;
    }
}