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
    public int findBottomLeftValue(TreeNode root) {
         Deque<TreeNode> deq = new LinkedList<>();
        deq.addLast(root);
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return 0;
        while(!deq.isEmpty()) {
            int n = deq.size();
            List<Integer> local = new ArrayList<>();
            for(int i=0;i<n;i++){
            TreeNode t = deq.pollFirst();
            local.add(t.val);
            if(t.left != null) deq.addLast(t.left);
            if(t.right != null) deq.addLast(t.right);
            }
            result.add(local);
        }
        return result.get(result.size()-1).get(0);
    }
}