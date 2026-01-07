//---------------------Maximum product of splitted binary tree--------------------------
class Solution {
    private long totalSum = 0;
    private long maxProduct = 0;
    private static final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        // Step 1: compute total sum
        totalSum = treeSum(root);

        // Step 2: compute max product
        computeProduct(root);

        return (int)(maxProduct % MOD);
    }
    // DFS to compute total sum
    private long treeSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }

    // DFS to compute subtree sums and products
    private long computeProduct(TreeNode node) {
        if (node == null) return 0;

        long leftSum = computeProduct(node.left);
        long rightSum = computeProduct(node.right);

