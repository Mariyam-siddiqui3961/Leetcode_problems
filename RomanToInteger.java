//-----------------Roman to Integer------------------------
class Solution {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));