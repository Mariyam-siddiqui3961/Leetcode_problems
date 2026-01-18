//--------------largest magic square-------------------
class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // Prefix sums
        int[][] row = new int[m][n + 1];
        int[][] col = new int[m + 1][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
                col[i + 1][j] = col[i][j] + grid[i][j];
            }
        }

        // Try sizes from largest to smallest
        for (int k = Math.min(m, n); k >= 2; k--) {
            for (int r = 0; r + k <= m; r++) {
                for (int c = 0; c + k <= n; c++) {
                    if (isMagic(grid, row, col, r, c, k)) {
                        return k;
                    }
                    }
            }
        }

        return 1; // At least 1x1 is magic
    }

    private boolean isMagic(int[][] grid, int[][] row, int[][] col,
                            int r, int c, int k) {

        // Target sum = first row
        int target = row[r][c + k] - row[r][c];

        // Check rows
        for (int i = r; i < r + k; i++) {
            if (row[i][c + k] - row[i][c] != target) return false;
        }

        // Check columns
        for (int j = c; j < c + k; j++) {
            if (col[r + k][j] - col[r][j] != target) return false;
        }

        // Check diagonals
        int d1 = 0, d2 = 0;
        for (int i = 0; i < k; i++) {
            d1 += grid[r + i][c + i];
            d2 += grid[r + i][c + k - 1 - i];
        }

        return d1 == target && d2 == target;
    }
}
