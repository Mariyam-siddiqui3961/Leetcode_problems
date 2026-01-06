//----------------------Maximum Level Sum of a Binary Tree------------------------
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;
        int answerLevel = 1;