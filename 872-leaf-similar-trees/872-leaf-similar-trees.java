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
    List<Integer> t1 = new ArrayList<>();
    List<Integer> t2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        rec(root1, t1);
        rec(root2, t2);
        return t1.equals(t2);
    }
    public void rec(TreeNode root, List<Integer> t){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            t.add(root.val);
            return;
        }
        rec(root.left, t);
        rec(root.right, t);
    }
}