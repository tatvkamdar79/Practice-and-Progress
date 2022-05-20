class Solution {
public:
    int maxScore(vector<int>& l, int k) {
        int s = 0;
        int N = l.size();
        int res = 0;
        for(int i = N-k; i < N; i++){
                res += l[i];
            }
        s = res;
        for(int i = 0; i < k; i++){
                s -= l[N-k+i];
                s += l[i];
                res = max(s, res);
            }
        return res;
    }
};