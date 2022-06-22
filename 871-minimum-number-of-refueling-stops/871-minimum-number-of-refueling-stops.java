class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        int i = 0, n = stations.length, maxReachable = startFuel, stops = 0;
        
        while(maxReachable < target){
            while(i < n && stations[i][0] <= maxReachable){
                pq.add(stations[i++][1]);
            }
            if(pq.isEmpty())    return -1;
            maxReachable += pq.poll();
            stops++;
        }
        return stops;
    }
}