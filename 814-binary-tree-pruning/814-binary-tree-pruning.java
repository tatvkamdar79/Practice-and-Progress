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
    public TreeNode pruneTree(TreeNode root) {
        return hasOne(root) ? root : null;
    }
    public boolean hasOne(TreeNode root){
        if(root == null)
            return false;
        
        boolean leftHasOne = hasOne(root.left);
        boolean rightHasOne = hasOne(root.right);
        
        if(!leftHasOne)
            root.left = null;
        if(!rightHasOne)
            root.right = null;
        return root.val == 1 || leftHasOne || rightHasOne;
    }
}