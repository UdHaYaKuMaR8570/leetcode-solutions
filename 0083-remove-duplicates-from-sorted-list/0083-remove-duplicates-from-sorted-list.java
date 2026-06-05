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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode curr=head;
//         while(curr!=null && curr.next!=null){
//             if(curr.val==curr.next.val){
//                 ListNode nextNext=curr.next.next;
//             curr.next=nextNext;
//             }
//             else{
//                 curr=curr.next;
//             }
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        if (head == null)
            return null;
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            if (set.contains(cur.val)) {
                prev.next = cur.next;
            } else {
                set.add(cur.val);
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}