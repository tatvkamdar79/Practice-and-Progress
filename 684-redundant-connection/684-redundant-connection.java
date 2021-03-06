class Solution {
    int[] parent, rank;
    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length + 1];
        rank = new int[edges.length + 1];
        Arrays.fill(rank, 1);
        Arrays.setAll(parent, i -> i);

        for(int[] a : edges){
            if(union(a[0], a[1]))   continue;
            else    return a;
        }
        return new int[2];
    }
    
    public boolean union(int n1, int n2){
         int p1 = find(n1), p2 = find(n2);
         if(p1 == p2)   return false;
         else if(rank[p1] > rank[p2]){
             parent[p2] = p1;
             rank[p1] += rank[p2];
         }
         else{
             parent[p1] = p2;
             rank[p2] += rank[p1];
         }
         return true;
     }
    
    public int find(int n){
        int p = parent[n];
        
        while(p != parent[p]){
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        
        return p;
    }
}