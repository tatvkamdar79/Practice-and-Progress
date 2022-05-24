class Solution {
public:
    int countSquares(vector<vector<int>>& matrix) {
        int dp[matrix.size()+1][matrix[0].size()+1];
        memset(dp, 0, sizeof(dp));
        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix[0].size(); j++){
                if(matrix[i][j] == 1){
                    dp[i+1][j+1] = 1 + min(dp[i][j], min(dp[i+1][j], dp[i][j+1]));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < matrix.size() + 1; i++){
            for(int j = 0; j < matrix[0].size() + 1; j++){
                ans += dp[i][j];
            }
        }
        return ans;
    }
};