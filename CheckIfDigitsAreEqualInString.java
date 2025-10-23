//-----------check if digits are equal in string-------------
class Solution {
    public boolean hasSameDigits(String s) {
        final int n = s.length();
        int num1 = 0, num2 = 0;
        for (int i = 0; i + 1 < n; ++i) {