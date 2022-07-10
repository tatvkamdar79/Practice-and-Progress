class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        while (!q.isEmpty()) {
            int node = q.poll();
            for(int nei: rooms.get(node))
                if(!seen[nei]){
                    seen[nei] = true;
                    q.add(nei);
                }
        }
        
        for(boolean v: seen)
            if(!v)
                return false;
        return true;
    }
}