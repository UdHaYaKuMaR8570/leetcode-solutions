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
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null)return null;
        ListNode cur=head;
        while(cur!=null && cur.next!=null)
        {
            ListNode dummy = new ListNode(0);
            ListNode temp=dummy;
            int x=gcd(cur.val,cur.next.val);
            ListNode node=new ListNode(x);
            node.next=cur.next;
            cur.next=node;
            cur=node.next;
        }
        return  head;
    }
} 