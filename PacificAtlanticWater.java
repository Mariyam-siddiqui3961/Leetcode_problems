//-------------------Pacific Atlantic Water--------------------------
class Solution {
    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0) return result;
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Pacific → top row & left column
        for (int i = 0; i < m; i++)
            dfs(heights, pacific, i, 0, heights[i][0]);
        for (int j = 0; j < n; j++)
            dfs(heights, pacific, 0, j, heights[0][j]);
            for (int i = 0; i < m; i++)
            dfs(heights, atlantic, i, n - 1, heights[i][n - 1]);
        for (int j = 0; j < n; j++)
            dfs(heights, atlantic, m - 1, j, heights[m - 1][j]);

        // Cells reachable by both oceans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int r, int c, int prevHeight) {
        if (r < 0 || c < 0 || r >= m || c >= n) return;
        if (visited[r][c]) return;
        if (heights[r][c] < prevHeight) return;

        visited[r][c] = true;

        for (int[] dir : directions) {
            dfs(heights, visited, r + dir[0], c + dir[1], heights[r][c]);
        }
    }
}
