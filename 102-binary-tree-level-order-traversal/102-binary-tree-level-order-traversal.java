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
    // public static List<List<Integer>> l = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> currLevel = new ArrayList<>();
            while(size-- > 0){
                TreeNode curr = q.poll();
                currLevel.add(curr.val);
                if(curr.left != null)   q.offer(curr.left);
                if(curr.right != null)  q.offer(curr.right);
            }
            res.add(currLevel);
        }
        
        return res;
    }
}