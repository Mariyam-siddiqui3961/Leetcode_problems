//-----------------------Last day where you can still cross----------------------
class Solution {

    private int ROWS, COLS;
    private int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    public int latestDayToCross(int row, int col, int[][] cells) {
        this.ROWS = row;
        this.COLS = col;

        int left = 1, right = cells.length;
        int answer = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canCross(mid, cells)) {
                answer = mid;
                left = mid + 1;   // try later days
            } else {
                right = mid - 1;  // try earlier days
            }
        }

        return answer;
    }