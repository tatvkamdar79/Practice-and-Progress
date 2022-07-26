/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution{
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
//         List<TreeNode> pathA = new ArrayList<>();
//         List<TreeNode> pathB = new ArrayList<>();
        
//         trav(root, p, new ArrayList<TreeNode>(), pathA);
//         trav(root, q, new ArrayList<TreeNode>(), pathB);

//         for(TreeNode node : pathA){
//             System.out.print(node.val + " -> ");
//         }
        
//         System.out.println();
        
//         for(TreeNode node : pathB){
//             System.out.print(node.val + " -> ");
//         }
        
//         for(int i = 0; i < Math.min(pathA.size(), pathB.size()); i++)
//             if(pathA.get(i) != pathB.get(i))
//                 return pathA.get(i-1);

//         return null;
//     }
//     public void trav(TreeNode root, TreeNode p, List<TreeNode> temp, List<TreeNode> path){
//         if(root == null)
//             return;
//         if(root.val == p.val){
//             temp.add(p);
//             for(TreeNode node : temp){
//                 path.add(node);
//                 // System.out.print(node.val + " -> ");
//             }
//             return;
//         }
//         temp.add(root);
//         trav(root.left, p, temp, path);
//         trav(root.right, p, temp, path);
//         temp.remove(temp.size() - 1);
//     }
// }