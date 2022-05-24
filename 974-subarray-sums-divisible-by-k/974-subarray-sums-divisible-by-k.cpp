class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        vector<int>count(k,0);
        count[0]=1;
        int ans=0;
        int prefix=0;
        for(int it:nums){
            prefix+=(it%k+k)%k;
            ans+=count[prefix%k]++;
        }
        return ans;
    }
};