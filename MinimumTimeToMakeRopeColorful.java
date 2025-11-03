//-----------minimum time to make rope colorful------------
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int maxTime = neededTime[0];  // max in current group