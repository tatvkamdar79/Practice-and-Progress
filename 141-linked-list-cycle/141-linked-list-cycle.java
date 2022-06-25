/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)   return false;
        int z = Integer.MIN_VALUE;
        while(head.val != z){
            head.val = z;
            if(head.next == null)   return false;
            head = head.next;
        }
        return true;
    }
}