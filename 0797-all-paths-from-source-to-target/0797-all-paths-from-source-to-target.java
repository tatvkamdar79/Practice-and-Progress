class Solution {
    int[][] paths;
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.paths = graph;
        int src = 0, dest = graph.length - 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(src, dest, temp);
        return ans;
    }
    public void dfs(int src, int dest, List<Integer> temp){
        if(src == dest){
            ans.add(new ArrayList<>(temp));
        }
        for(int i : paths[src]){
            temp.add(i);
            dfs(i, dest, temp);
            temp.remove(temp.size() - 1);
        }
    }
}