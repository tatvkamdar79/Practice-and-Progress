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
    Set<String> l = new HashSet<>();
    public List<String> binaryTreePaths(TreeNode root) {
        rec(root, "");
        return new LinkedList<String>(l); 
    }
    public void rec(TreeNode root, String s){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            l.add(s+Integer.toString(root.val));
            return;
        }
        s += Integer.toString(root.val) + "->";
        rec(root.left, s);
        rec(root.right, s);
    }
}