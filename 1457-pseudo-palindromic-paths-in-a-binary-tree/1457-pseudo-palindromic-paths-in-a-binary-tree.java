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
    public int pseudoPalindromicPaths (TreeNode root) {
        int count = 0, path = 0;
        
        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque();
        stack.push(new Pair(root, 0));
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> p = stack.pop();
            TreeNode node = p.getKey();
            path = p.getValue();

            if (node != null) {
                // compute occurences of each digit 
                // in the corresponding register
                path = path ^ (1 << node.val);
                // if it's a leaf check if the path is pseudo-palindromic
                if (node.left == null && node.right == null) {
                    // check if at most one digit has an odd frequency
                    if ((path & (path - 1)) == 0) {
                        ++count;
                    }
                } else {
                    stack.push(new Pair(node.right, path));
                    stack.push(new Pair(node.left, path));
                }
            }
        }
        return count;
    }
}
// class Solution {
//     public int pseudoPalindromicPaths (TreeNode root) {
//         int[] check = new int[10];
//         return dfs(root, check);
//     }
//     public int dfs(TreeNode root, int[] check){
//         if(root == null)
//             return 0;
//         if(root.left == null && root.right == null){
//             check[root.val]++;
//             // System.out.println(Arrays.toString(check));
//             int flag = 0;
//             for(int i = 0; i < 10; i++){
//                 if(flag > 1){
//                     check[root.val]--;
//                     return 0;
//                 }
//                 if(check[i]%2 == 0 && flag <= 1)
//                     continue;
//                 else
//                     ++flag;
//             }
//             check[root.val]--;
//             return 1;
//         }
//         check[root.val]++;
//         int l = dfs(root.left, check);
//         int r = dfs(root.right, check);
//         check[root.val]--;
//         return l + r;
//     }
// }