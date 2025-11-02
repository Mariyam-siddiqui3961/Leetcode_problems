//-----count unguarded cell in grid-----------
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
         // 0 = empty, 1 = guard, 2 = wall, 3 = guarded
        int[][] grid = new int[m][n];

        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        for (int[] w : walls) grid[w[0]][w[1]] = 2;