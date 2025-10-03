//--------------------Trapping rain water --------------------
class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length, n = heightMap[0].length;
        //no space to hold water
        if(m<=2 || n<=2) return 0;