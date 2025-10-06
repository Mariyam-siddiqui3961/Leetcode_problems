//---------------------Swim in rising water---------------------------
class Solution {
    public int swimInWater(int[][] grid) {
         int n = grid.length;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean[][] visited = new boolean[n][n];
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0}); // {height, row, col}
        visited[0][0] = true;
        
        int time = 0;