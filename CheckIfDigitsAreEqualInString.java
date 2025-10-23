//-----------check if digits are equal in string-------------
class Solution {
    public boolean hasSameDigits(String s) {
        final int n = s.length();
        int num1 = 0, num2 = 0;
        for (int i = 0; i + 1 < n; ++i) {
             int coefficient = nCkMod10(n - 2, i);
            num1 = (num1 + coefficient * (s.charAt(i) - '0')) % 10;
            num2 = (num2 + coefficient * (s.charAt(i + 1) - '0')) % 10;
        }
        return num1 == num2;
    }
     // Returns (n choose k) % 10.
    private int nCkMod10(int n, int k) {
        int mod2 = lucas(n, k, 2);
        int mod5 = lucas(n, k, 5);
        int[][] lookup = {
            {0, 6, 2, 8, 4}, // mod2 == 0
            {5, 1, 7, 3, 9}  // mod2 == 1