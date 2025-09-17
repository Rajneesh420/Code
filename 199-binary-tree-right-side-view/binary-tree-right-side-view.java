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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> deq = new LinkedList<>();
        deq.addLast(root);
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        while(!deq.isEmpty()) {
            int n = deq.size();
            for(int i=0;i<n;i++){
            TreeNode t = deq.pollFirst();
            if(i==n-1)
            result.add(t.val);
            if(t.left != null) deq.addLast(t.left);
            if(t.right != null) deq.addLast(t.right);
            }
        }
        return result;
    }
}