class Solution {
public:
    int getMaximumConsecutive(vector<int>& coins) {
        int c = 1;
        sort(coins.begin(), coins.end());
        for(int i : coins){
            if(i > c)   return c;
            c += i;
        }
        return c;
    }
};