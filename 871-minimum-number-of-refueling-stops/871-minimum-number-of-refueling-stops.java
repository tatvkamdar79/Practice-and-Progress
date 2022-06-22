class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        int n = stations.length, i = 0, stops = 0, maxReachable = startFuel;
        
        while(maxReachable < target){
            
            while(i < n && stations[i][0] <= maxReachable)
                pq.offer(stations[i++][1]);
            
            if(pq.isEmpty()) return -1;
            
            maxReachable += pq.poll();
            
            stops += 1;
        }
        return stops;
    }
}