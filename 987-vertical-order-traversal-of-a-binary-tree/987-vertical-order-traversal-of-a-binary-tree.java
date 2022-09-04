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
// Just One tescase not passing!!!!!
class Solution {
    public PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[2] - y[2]);
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        rec(root, 0, 0);
        // System.out.println(pq);
        List<List<Integer>> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            int[] arr = pq.peek();
            int col = arr[2];
            List<int[]> order = new ArrayList<>();
            Map<Integer, List<Integer>> mp = new HashMap<>();
            while(!pq.isEmpty() && pq.peek()[2] == col){
                int[] curr = pq.poll();
                mp.putIfAbsent(curr[1], new ArrayList<>());
                mp.get(curr[1]).add(curr[0]);
                order.add(curr);
            }
            // for(int[] i : order){
            //     System.out.println(i[0] + " " + i[1] + " " + i[2]);
            // }
            List<Integer> temp = new ArrayList<>();
            for(int[] i : order)
                Collections.sort(mp.get(i[1]));
            List<Integer> keys = new ArrayList<>(mp.keySet());
            Collections.sort(keys);
            for(int i : keys){
                for(int j : mp.get(i)){
                    temp.add(j);
                }
            }
            // for(int[] i : order){
            //     int val = mp.get(i[1]).get(0);
            //     mp.get(i[1]).remove(0);
            //     temp.add(val);
            // }
            ans.add(temp);
        }
        return ans;
    }
    public void rec(TreeNode root, int row, int col){
        if(root == null)
            return;
        pq.add(new int[]{root.val, row, col});
        rec(root.left, row+1, col-1);
        rec(root.right, row+1, col+1);
    }
}