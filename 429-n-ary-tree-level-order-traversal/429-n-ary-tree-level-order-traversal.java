/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null)
            return Collections.emptyList();
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> lvl = new ArrayList<>();
            while(size-->0){
                Node temp = q.poll();
                lvl.add(temp.val);
                for(Node n : temp.children){
                    q.offer(n);
                }
            }
            ans.add(lvl);
        }
        return ans;
    }
}