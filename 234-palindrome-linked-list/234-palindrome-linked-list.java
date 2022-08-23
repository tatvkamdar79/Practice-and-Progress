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
        List<Integer> l = new ArrayList<>();
        List<Integer> rev = new ArrayList<>();
        while(head != null){
            l.add(head.val);
            rev.add(head.val);
            head = head.next;
        }
        Collections.reverse(rev);
        for(int i = 0; i < l.size(); i++){
            if(l.get(i) != rev.get(i))
                return false;
        }
        return true;
    }
}