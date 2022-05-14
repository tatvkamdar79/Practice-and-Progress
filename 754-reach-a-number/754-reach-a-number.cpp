class Solution {
public:
    int reachNumber(int target) {
        // O(1) Solution
        
        // target = abs(target);
        // long long n = ceil((-1 + sqrt(1 + 8.0*(target))) / 2);
        // long long sum = (n * (n+1)) / 2;
        // if(sum == target)   return n;
        // long long rem = sum - target;
        // if((rem&1) == 0)    return n;
        // return n + ((n&1) ? 2 : 1);
        
        
        // O(logn) ig
        
        int sum = 0, steps = 0;
        target = abs(target);
        while(sum < target || (target - sum) % 2 != 0) {
            steps++;
            sum += steps;
        }
        
        return steps;
    }
};