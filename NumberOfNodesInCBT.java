class TreeNode{
  int val;
  TreeNode left,right;
  TreeNode(int val){ this.val = val; }
}

class Solution{
  public int countNodes(TreeNode root) {
    if(root == null) return 0;
    int leftheight = getLeftHeight(root);
    int rightheight = getRightHeight(root);
    if(leftheight == rightheight)
      return 1 << leftheight -1;
    return 1+countNodes(root.left)+countNodes(root.right);
  }
  private int getLeftHeight(TreeNode node) {
    int h = 0;
    while(node != null) { h++; node = node.left;}
    return h;
  }
  private int getRightHeight(TreeNode node) {
    int h = 0;
    while(node != null) { h++; node = node.right; }
  }
}
