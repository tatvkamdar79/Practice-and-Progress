class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int frq[k];
        memset(frq, 0, sizeof(frq));
        int sum=0, count =0;
        frq[0] = 1;
        for(int i=0 ; i<nums.size() ; i++){
            sum += nums[i];
            int rem = sum%k;
            if(rem < 0) rem += k;
            count += frq[rem];
            frq[rem]++;
        }
        return count;
    }
};