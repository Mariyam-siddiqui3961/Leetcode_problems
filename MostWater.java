//---------Container With Most Water------------------
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;