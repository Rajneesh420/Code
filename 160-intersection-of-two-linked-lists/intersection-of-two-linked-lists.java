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
    public ListNode find(ListNode headA,ListNode headB,ListNode t1,ListNode t2){
        if(t1==t2) return t1;
        if(t1==null) t1=headB;
        else t1=t1.next;
        if(t2==null) t2=headA;
        else t2=t2.next;
        return find(headA,headB,t1,t2);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        return find(headA,headB,t1,t2);
    }
}