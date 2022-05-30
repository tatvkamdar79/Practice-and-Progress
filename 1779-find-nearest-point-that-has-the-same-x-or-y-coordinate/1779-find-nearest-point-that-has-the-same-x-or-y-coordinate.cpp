class Solution {
public:
    int nearestValidPoint(int x, int y, vector<vector<int>>& points) {
        int dist = INT_MAX;
        int ans = 0;
        for(int i = 0; i < points.size(); i++){
            vector<int> arr = points[i];
            if(arr[0] == x || arr[1] == y){
                int curr = abs(x - arr[0]) + abs(y - arr[1]);
                if(curr < dist){
                    dist = curr;
                    ans = i;
                }
            }
        }
        return dist == INT_MAX ? -1 : ans;
    }
};