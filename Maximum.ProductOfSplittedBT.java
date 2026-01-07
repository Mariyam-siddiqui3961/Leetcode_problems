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
