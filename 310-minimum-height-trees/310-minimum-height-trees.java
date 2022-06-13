class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 0){
            return Collections.emptyList();
        }
        if(n == 1){
            List<Integer> t = new ArrayList<>();
            t.add(0);
            return t;
        }
        List<List<Integer>> G = new ArrayList<>();
        for(int i = 0; i < n; i++)
            G.add(new ArrayList<Integer>());
        int[] degrees = new int[n];
        for(int i = 0; i < edges.length; i++){
            G.get(edges[i][0]).add(edges[i][1]);
            G.get(edges[i][1]).add(edges[i][0]);
            degrees[edges[i][1]]++;
            degrees[edges[i][0]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; ++i){
            if(degrees[i] == 1)
                q.add(i);
            }
    
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.clear();
            int size = q.size();
            while(size-- > 0){
                int curr = q.poll();
                ans.add(curr);
                for(int i : G.get(curr)){
                    degrees[i]--;
                    if(degrees[i] == 1)
                        q.add(i);
                }
            }
        }
        return ans;
    }
}