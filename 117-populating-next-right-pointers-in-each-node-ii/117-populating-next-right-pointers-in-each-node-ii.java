/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)    return null;
        Queue<Node> q = new LinkedList<>();
        Node toReturn = root;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            // Node curr = q.poll();
            while(size-- > 0){
                Node curr = q.poll();
                if(curr.left != null)   q.add(curr.left);
                if(curr.right != null)  q.add(curr.right);
                
                if(size == 0){
                    curr.next = null;
                    continue;
                }
                
                Node next_right = q.peek();
                
                curr.next = next_right;
            }
            // for(Node item: q) {
            //     System.out.print(item.val + " ");
            // }
            // System.out.println();
        }
        return toReturn;
    }
}