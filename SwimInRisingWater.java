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
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int height = curr[0], r = curr[1], c = curr[2];
            
            time = Math.max(time, height);
            if (r == n - 1 && c == n - 1) return time;
            
            for (int[] dir : directions) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr < 0 || nc < 0 || nr >= n || nc >= n || visited[nr][nc]) continue;
                
                visited[nr][nc] = true;
                pq.offer(new int[]{grid[nr][nc], nr, nc});
            }
        }
        return -1;
    }
}