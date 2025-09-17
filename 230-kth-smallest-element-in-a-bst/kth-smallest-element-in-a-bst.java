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
    public int count = 0 , ans = 0;
    public void Count(TreeNode root,int k) {
        if(root == null) return ;
        Count(root.left,k);
        count++;
        if(count == k) {
            ans = root.val;
            return ;
        }
        Count(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        Count(root,k);
        return ans;
    }
}