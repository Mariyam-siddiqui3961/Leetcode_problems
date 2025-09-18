//--------valid Parenthesis String--------------------
class Solution {
    public boolean checkValidString(String s) {
        int low = 0;   
        int high = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low--;
                high--;
            } else { 
                low--;     
                high++; 