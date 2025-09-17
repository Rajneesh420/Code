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
        if(root == null ) return -1;
        Deque<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        int ans = -1;
        while(!q.isEmpty()){
            int size = q.size();
            

            for(int i =0; i<size ; i++){
            TreeNode current = q.pollFirst();
            if(i==0){
                ans = current.val;
            } 
            if(current.left != null ) q.addLast(current.left);
            if(current.right != null) q.addLast(current.right);
            }
            
        }
        return ans;
    }
}