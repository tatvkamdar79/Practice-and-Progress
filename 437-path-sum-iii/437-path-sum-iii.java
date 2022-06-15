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
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    public int pathSumFrom(TreeNode node, int sum) {
        if (node == null) return 0;
        if(node.val == sum){
            return 1 + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
        }
        return pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }
}