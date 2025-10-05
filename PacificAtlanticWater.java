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