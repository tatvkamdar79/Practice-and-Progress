/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    public Node copyRandomList(Node original) {
        if (original == null)
            return null;
        HashMap<Node, Node> mp = new HashMap<>();

        Node original2 = original;
        Node copy1 = new Node(original.val);
        Node ans = copy1;

        mp.put(original, copy1);

        Node copy2 = copy1;

        original = original.next;
        while (original != null) {
            copy1.next = new Node(original.val);
            copy1 = copy1.next;
            mp.put(original, copy1);
            original = original.next;
        }
        while(original2 != null){
            Node copy = mp.get(original2);
            if(original2.random != null) {
                Node randomCopy = mp.get(original2.random);
                copy.random = randomCopy;
            }
            original2 = original2.next;
        }
        return ans;
    }
}