class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        int maxReachable = startFuel, stops = 0, i = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        
        while(maxReachable < target){
            
            while(i < stations.length && stations[i][0] <= maxReachable)
                pq.add(stations[i++][1]);
            
            if(pq.isEmpty())
                return -1;
            
            maxReachable += pq.poll();
            stops++;
        
        }
        
        return stops;
    }
}