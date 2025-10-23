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