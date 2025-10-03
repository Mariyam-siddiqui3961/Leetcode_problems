//--------------------Trapping rain water --------------------
class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length, n = heightMap[0].length;
        //no space to hold water
        if(m<=2 || n<=2) return 0;
        boolean[][] visited = new boolean[m][n];
         PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        //push all boundry cells
        for (int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || j == 0|| i == m-1 || j == n-1){
                    pq.offer(new int[]{i,j,heightMap[i][j]});
                    visited[i][j] = true;
                }