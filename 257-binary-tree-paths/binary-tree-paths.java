class Solution {
    List<String> result = new ArrayList<>();
    
    void Path(TreeNode root, String path) {
        if (root == null) return;
        
        if (root.left == null && root.right == null) {
            result.add(path + root.val);
            return;
        }
        
        Path(root.left, path + root.val + "->");
        Path(root.right, path + root.val + "->");
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        Path(root, "");
        return result;
    }
}