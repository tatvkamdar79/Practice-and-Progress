/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        Stack<ListNode> stack = new Stack<>();
        while(fast!=null && fast.next!=null){
            stack.push(slow);
            fast = fast.next.next;
            slow=slow.next;
        }
        if(fast!=null)
            slow = slow.next;
        while(slow!=null){
            if(stack.pop().val!=slow.val) return false;
            slow = slow.next;
        }
        return true;
    }
}