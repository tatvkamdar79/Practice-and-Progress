class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int size = heights.length-1;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<size; i++){
            if (heights[i+1] <= heights[i])    continue; // move forward without using brick or ladder
            int diff = heights[i+1] - heights[i];
            q.add(diff);
            if (q.size() > ladders){ // anytime running out of ladders we use bricks
                bricks -= q.peek();
                q.poll();
                if (bricks < 0)
                    return i;
            }
        }
        return size;
    }
}