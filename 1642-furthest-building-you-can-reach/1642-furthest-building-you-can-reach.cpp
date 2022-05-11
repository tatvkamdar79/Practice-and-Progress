class Solution {
public:
    int furthestBuilding(vector<int>& heights, int bricks, int ladders) {
        priority_queue<int> pq;
        for(int i = 0; i < heights.size() - 1; i++){
            if(heights[i] - heights[i+1] >= 0)  continue;
            
            int d = heights[i+1] - heights[i];
            
            pq.push(d);
            bricks -= d;
            
            if(bricks >= 0)  continue;
            
            if(ladders == 0) return i;

            bricks += pq.top();
            pq.pop();
            ladders--;
        }
        return heights.size() - 1;
    }
};