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
    public ListNode detectCycle(ListNode head) {
        if(head == null)    return null;
        HashMap<ListNode, Integer> mp = new HashMap<>();
        ListNode dummy = head;
        int i = 0;
        while(mp.get(head) == null){
            mp.put(head, i);
            i++;
            head = head.next;
            if(head == null)    return null;
        }
        int ind = mp.get(head);
        head = dummy;
        for(i = 0; i < ind; i++){
            head = head.next;
        }
        return head;
    }
}
//         if(head == null || head.next == null)    return  null;
//         int m = Integer.MIN_VALUE;
//         List<Integer> l = new LinkedList<Integer>();
//         ListNode dummy = head;
//         int c = 0;
//         while(head != null && head.val < Math.pow(-10,5)){
//             if(head.val < Math.pow(-10,5))   break;
//             l.add(head.val);
//             head.val = m+c;
//             c++;
//             head = head.next;
//         }
        
//         if(c == 0){
//             int i = 0;
//             head = dummy;
//             while(head != null && i < l.size()){
//                 head.val = l.get(i);
//                 head = head.next;
//                 i++;
//             }
//             return dummy;
//         }
        
//         // head.val - m = the numbe of the node;
//         int ind = head.val - m;
//         int i = 0;
//         head = dummy;
//         while(i < c){
//             head.val = l.get(i);
//             head = head.next;
//             i++;
//         }
//         i = 0;
//         head = dummy;
//         for(i = 0; i < ind; i++){
//             head = head.next;
//         }
//         return head;        
//     }
// }