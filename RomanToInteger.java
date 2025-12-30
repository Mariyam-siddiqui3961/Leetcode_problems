//-----------------Roman to Integer------------------------
class Solution {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            // If next symbol exists and is larger, subtract
            if (i + 1 < s.length() && curr < value(s.charAt(i + 1))) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }
