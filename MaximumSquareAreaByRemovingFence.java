//-----------maximum square area by removing fence----------------
class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        final int MOD = 1_000_000_007;

        // Add boundaries
        int[] H = new int[hFences.length + 2];
        int[] V = new int[vFences.length + 2];