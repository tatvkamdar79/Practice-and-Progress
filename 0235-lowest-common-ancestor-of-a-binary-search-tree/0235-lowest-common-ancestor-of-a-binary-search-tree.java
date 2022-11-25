/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q)
            return root;
        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(root);
        int pval = p.val, qval = q.val;
        while(!qq.isEmpty()){
            int size = qq.size();
            while(size-- > 0){
                TreeNode curr = qq.poll();
                if(curr == p || curr == q)
                    return curr;
                if(pval < curr.val && curr.val < qval)
                    return curr;
                if(qval < curr.val && curr.val < pval)
                    return curr;
                if(curr.left != null)
                    qq.add(curr.left);
                if(curr.right != null)
                    qq.add(curr.right);
            }
        }
        return null;
    }
}