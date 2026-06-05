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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode cur = head;
        while (cur != null) {
            map.put(cur.val, map.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        cur=head;
        while (cur != null) {
            if (map.get(cur.val) == 1) {
                temp.next = new ListNode(cur.val);
                temp = temp.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}