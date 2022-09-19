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
    public TreeNode reverseOddLevels(TreeNode root) {
        rec(root.left, root.right, 1);
        return root;
    }

    public void rec(TreeNode l, TreeNode r, int lvl) {
        if (l == null || r == null) return;
        
        if (lvl % 2 == 1){
            int temp = l.val;
            l.val = r.val;
            r.val = temp;
        }
        
        rec(l.left, r.right, lvl + 1);
        rec(l.right, r.left, lvl + 1);
    }
}