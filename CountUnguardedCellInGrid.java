//-----count unguarded cell in grid-----------
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
         // 0 = empty, 1 = guard, 2 = wall, 3 = guarded
        int[][] grid = new int[m][n];

        for (int[] g : guards) grid[g[0]][g[1]] = 1;
        for (int[] w : walls) grid[w[0]][w[1]] = 2;

        // ---- Scan rows: LEFT TO RIGHT ----
        for (int i = 0; i < m; i++) {
            boolean seenGuard = false;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) seenGuard = true;
                else if (grid[i][j] == 2) seenGuard = false;
                else if (seenGuard) grid[i][j] = 3;
            }
        }

         // ---- Scan rows: RIGHT TO LEFT ----
        for (int i = 0; i < m; i++) {
            boolean seenGuard = false;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 1) seenGuard = true;
                else if (grid[i][j] == 2) seenGuard = false;
                else if (seenGuard) grid[i][j] = 3;
            }
        }

        
