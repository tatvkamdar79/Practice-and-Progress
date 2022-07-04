class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        int[][] g = new int[n][n];
        buildGraph(g, n, red_edges, blue_edges);
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 1});
        q.offer(new int[]{0, -1});
        int len = 0;
        int[] res = new int[n];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;
        
        Set<String> visited = new HashSet<>();
        while (!q.isEmpty()) {
            int size = q.size();
            len++;
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int node = cur[0];
                int color = cur[1];
                int oppoColor = -color;
                
                for (int j = 1; j < n; j++) {
                    if (g[node][j] == oppoColor ||
                       g[node][j] == 0) {
                        if (!visited.add(j + "" + oppoColor)) continue;
                        q.offer(new int[]{j, oppoColor});
                        res[j] = Math.min(res[j], len);
                    }
                }
            }
        }
        
        for (int i = 1; i < n; i++) {
            if (res[i] == Integer.MAX_VALUE) {
                res[i] = -1;
            }
        }
        
        return res;
    }
    
    private void buildGraph(int[][] g, int n, int[][] red_edges, int[][] blue_edges) {
        for (int i = 0; i < n; i++) {
            Arrays.fill(g[i], -n);
        }
        
        for (int[] e : red_edges) {
            int from = e[0];
            int to = e[1];
            g[from][to] = 1;
        }
        
        for (int[] e : blue_edges) {
            int from = e[0];
            int to = e[1];
            if (g[from][to] == 1) {
                g[from][to] = 0;
            } else {
                g[from][to] = -1;
            }
        }
    }
}
// class Solution {
//     public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
//         int[] ans = new int[n];
//         Arrays.fill(ans, Integer.MAX_VALUE);
//         ans[0] = 0;
//         int[][] red_adj = new int[n][n];
//         int[][] blue_adj = new int[n][n];
        
//         for(int[] edge : redEdges)
//             red_adj[edge[0]][edge[1]] = 1;
//         for(int[] edge : blueEdges)
//             blue_adj[edge[0]][edge[1]] = 1;
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);
//         int steps = 1, turn = 0;
//         Set<Integer> redVis = new HashSet<>();
//         Set<Integer> blueVis = new HashSet<>();
        
//         while(!q.isEmpty()){
//             int size = q.size();
//             while(size-- > 0){
//                 int curr = q.poll();
//                 if(turn % 2 == 0){
//                     for(int i : red_adj[curr]){
//                         if(i != 0 && redVis.add(i)){
//                             ans[i] = Math.min(ans[i], steps);
//                             q.add(i);
//                         }
//                     }
//                 }
//                 else{
//                     for(int i : blue_adj[curr]){
//                         if(i != 0 && blueVis.add(i)){
//                             ans[i] = Math.min(ans[i], steps);
//                             q.add(i);
//                         }
//                     }
//                 }
//                 turn++;
//                 steps++;
//             }
//         }
//         q.clear();
//         q.add(0);
//         turn = 1;
//         steps = 1;
//         redVis.clear();
//         blueVis.clear();
//         while(!q.isEmpty()){
//             int size = q.size();
//             while(size-- > 0){
//                 int curr = q.poll();
//                 if(turn % 2 == 0){
//                     for(int i : red_adj[curr]){
//                         if(i != -1 && redVis.add(i)){
//                             ans[i] = Math.min(ans[i], steps);
//                             q.add(i);
//                         }
//                     }
//                 }
//                 else{
//                     for(int i : blue_adj[curr]){
//                         if(i != -1 && blueVis.add(i)){
//                             ans[i] = Math.min(ans[i], steps);
//                             q.add(i);
//                         }
//                     }
//                 }
//             }
//             turn++;
//             steps++;
//         }
//         for(int i = 0; i < n; i++)
//             if(ans[i] == Integer.MAX_VALUE)
//                 ans[i] = -1;
//         return ans;
//     }
// }