//--------------------smallest subtree with all the deepest node-------------------
class Solution {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null) return null;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        if (leftDepth == rightDepth) {
            return root;
        }