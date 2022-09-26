class Solution {
    int[] parent = new int[26];
    public boolean equationsPossible(String[] equations) {
        
        for(int i=0;i<26;i++){
            parent[i] = i;
            
        }
        
        for(String s : equations){
            if(s.substring(1, 3).equals("==") && s.charAt(0) != s.charAt(3))
                union(find(s.charAt(0)-'a'), find(s.charAt(3)-'a'));
        }
        for(String s : equations){
            if(s.substring(1, 3).equals("!=") && find(s.charAt(0)-'a') == find(s.charAt(3)-'a'))
                return false;
        }
        return true;
    }
    public void union(int x, int y){
        parent[y] = x;
    }
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
}