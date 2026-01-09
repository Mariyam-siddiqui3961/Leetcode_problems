//--------------------smallest subtree with all the deepest node-------------------
class Solution {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return null;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        if (leftDepth == rightDepth) {
            return root;
        }
        if (leftDepth > rightDepth) {
            return subtreeWithAllDeepest(root.left);
        } else {
            return subtreeWithAllDeepest(root.right);
        }
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(depth(node.left), depth(node.right));
    }
}