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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode BST(ListNode head,ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == tail) return null;

        while(fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode thead = new TreeNode(slow.val);
        thead.left = BST(head,slow);
        thead.right = BST(slow.next,tail);
        return thead;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return BST(head,null);
    }
}