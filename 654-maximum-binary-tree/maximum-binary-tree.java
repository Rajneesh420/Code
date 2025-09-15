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
    TreeNode root = null;
    public TreeNode BST(int[] nums,int left,int right) {
        if (left > right) return null;
        int max = nums[left];
        int maxIndex = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = BST(nums, left, maxIndex - 1);
        root.right = BST(nums, maxIndex + 1, right);

        return root;

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return BST(nums,0,nums.length-1);
    }
}