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
    int[] arr;
    int n;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.arr = nums;
        this.n = nums.length;
        return rec(0, n);
    }
    public TreeNode rec(int lo, int hi){
        if(lo < 0 || hi > n)
            return null;
        if(lo >= hi)
            return null;
        if(lo == hi){
            TreeNode root = new TreeNode(arr[lo]);
            return root;
        }
        int mid = (lo + hi)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = rec(lo, mid);
        root.right = rec(mid + 1, hi);
        return root;
    }
}