//------------Maximize the expression of three element---------------
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = Integer.MIN_VALUE;

        int max2 = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;

        for(int x : nums){
            if(x > max1){
                max2 = max1;
                max1 = x;
            }else if (x > max2){
                max2 = x;