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
    public int maxLevel = 0;
    public int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }
    public void dfs(TreeNode root, int level){
        if(root == null){
            return;
        }
        if(level > maxLevel){
            sum = 0;
            maxLevel = level;
        }
        if(level == maxLevel){
            sum += root.val;
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}