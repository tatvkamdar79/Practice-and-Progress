class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] redLastPaths = new int[n];
        int[] blueLastPaths = new int[n];
        Arrays.fill(redLastPaths, -1);
        Arrays.fill(blueLastPaths, -1);
        redLastPaths[0] = blueLastPaths[0] = 0;
        while (true)
            if (exploreEdges(redEdges, redLastPaths, blueLastPaths) && // from blue last to red last
                    exploreEdges(blueEdges, blueLastPaths, redLastPaths)) // from red last to blue last
                break;
        for (int p = 0; p < n; p++) {
            if (redLastPaths[p] == -1)
                redLastPaths[p] = blueLastPaths[p];
            else if (blueLastPaths[p] == -1)
                redLastPaths[p] = redLastPaths[p];
            else
                redLastPaths[p] = Math.min(redLastPaths[p], blueLastPaths[p]);
        }
        return redLastPaths;
    }
    
    // Updates paths with one layer of exploration via edges.
    // Returns whether a change was made to paths.
    private boolean exploreEdges(int[][] edges, int[] fromPaths, int[] toPaths) {
        boolean done = true;
        int[] prevToPaths = toPaths.clone();
        for (int[] edge : edges) {
            // if first valid path to edge[1]
            if (fromPaths[edge[0]] != -1 &&
                    (toPaths[edge[1]] == -1 || fromPaths[edge[0]] + 1 < toPaths[edge[1]])) {
                toPaths[edge[1]] = fromPaths[edge[0]] + 1;
                done = false;
            }
        }
        return done;
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