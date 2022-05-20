class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        ios::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
        int frontScore = 0; 
        for (int i=0; i<k; i++)
            frontScore += cardPoints[i]; 
        int ans = frontScore, ind = k-1, backScore = 0; 
        for (int i=cardPoints.size()-1; i>=int(cardPoints.size())-k; i--){
            if (ind>=0)
                frontScore -= cardPoints[ind--]; 
            backScore += cardPoints[i]; 
            ans = max(ans, frontScore+backScore);
        }
        return ans;
    }
};