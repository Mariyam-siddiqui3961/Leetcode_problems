//----------------------Maximum Level Sum of a Binary Tree------------------------
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 0;
        int answerLevel = 1;
        long maxSum = Long.MIN_VALUE;

        while(!q.isEmpty()){
            int size = q.size();
            level++;
            long levelSum = 0;

            for(int i = 0; i<size; i++){
                TreeNode node = q.poll();
                levelSum += node.val;