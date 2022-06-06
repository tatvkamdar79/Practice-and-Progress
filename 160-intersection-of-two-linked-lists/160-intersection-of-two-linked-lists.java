/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s = new HashSet<>();
        while(headA != null){
            s.add(headA);
            headA = headA.next;
        }
        // System.out.println(headA);
        while(headB != null){
            if(s.add(headB)){
                headB = headB.next;
            }
            else{
                return headB;
            }
        }
        return null;
    }
}