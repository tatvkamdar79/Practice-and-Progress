class Solution {
    long ans = 0, s;
    public long minimumFuelCost(int[][] roads, int seats) {
        s = seats;
        List<List<Integer>> g = new ArrayList<>();
        for(int i = 0; i < roads.length + 1; i++)   g.add(new ArrayList());
        for(int[] i : roads){
            g.get(i[0]).add(i[1]);
            g.get(i[1]).add(i[0]);
        }
        dfs(0, 0, g);
        return ans;
    }
    public long dfs(int i, int prev, List<List<Integer>> graph){
        long people = 1;
        for(int p : graph.get(i))
            if(p != prev)
                people += dfs(p, i, graph);
        if(i != 0)  ans += (people / s) + (people % s == 0 ? 0 : 1);
        return people;
    }
}