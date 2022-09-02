/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer, Set<Integer>> mp = new HashMap<>();
    public void dfs(TreeNode cur, TreeNode parent){
        if(cur == null)
            return;
        if(parent != null) {
            mp.putIfAbsent(parent.val, new HashSet<>());
            mp.get(parent.val).add(cur.val);
            mp.putIfAbsent(cur.val, new HashSet<>());
            mp.get(cur.val).add(parent.val);
        }
        dfs(cur.left, cur);
        dfs(cur.right, cur);
    }
    public int amountOfTime(TreeNode root, int start) {
        dfs(root, null);
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited.add(start);
        int cnt = mp.entrySet().size();
        int res = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int cur = q.poll();
                cnt--;
                if(cnt == 0)
                    return res;
                for(int nei : mp.getOrDefault(cur, new HashSet<>())){
                    if(visited.add(nei))
                        q.offer(nei);
                }
            }
            res++;
        }
        return 0;
    }
}