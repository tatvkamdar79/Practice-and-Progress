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
    public int[] pre;
    public int root_val = 0;
    public Map<Integer, Integer> mp = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        pre = preorder;
        
        for(int i = 0; i < inorder.length; i++){
            mp.put(inorder[i], i);
        }
        
        return construct(0, inorder.length - 1, 0);
    }
    
    public TreeNode construct(int l, int r, int new_root_idx){
        if(l > r)
            return null;
        
        int curr_root = pre[root_val];
        root_val++;
        TreeNode root = new TreeNode(curr_root);
        
        TreeNode left = construct(l, mp.get(curr_root) - 1, new_root_idx + 1);
        root.left = left;
        
        TreeNode right = construct(mp.get(curr_root) + 1, r, new_root_idx + 1);
        root.right = right;
        
        return root;
    }
}
//                     1
//             2              3
//         4       5       6      7
//       a   b   c  d    e   f   g   h;

// pre -> 1 2 4 a b 5 c d *3* 6 e f 7 g h;

// ino -> a 4 b 2 c 5 d 1 e 6 f 3 g 7 h;
