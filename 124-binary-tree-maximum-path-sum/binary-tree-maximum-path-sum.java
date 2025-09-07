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
    int max = Integer.MIN_VALUE;
    public int DFS(TreeNode root) {
        if(root == null) return 0;
        int leftSum = Math.max(DFS(root.left),0);
        int rightSum = Math.max(DFS(root.right),0);
        max = Math.max(leftSum+rightSum+root.val,max);
        return Math.max(leftSum,rightSum)+root.val;

    }
    public int maxPathSum(TreeNode root) {
        DFS(root);
        return max;
    }
}