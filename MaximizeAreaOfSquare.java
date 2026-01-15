//-------------------Maximize Area of square hole in grid-----------------
class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        int maxHeight = getMaxGap(hBars);
        int maxWidth = getMaxGap(vBars);

        int side = Math.min(maxHeight, maxWidth);
        return side * side;
    }

    private int getMaxGap(int[] bars) {
        Arrays.sort(bars);

        int maxConsecutive = 1;
        int current = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                current++;
            } else {
                current = 1;
            }
            maxConsecutive = Math.max(maxConsecutive, current);
        }

        // +1 because removing k consecutive bars creates (k+1) gap
        return maxConsecutive + 1;
    }
}
