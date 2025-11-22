//---------------zigzag conversion-----------
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;
        //create rows
        List <StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i< numRows; i++){
            rows.add(new StringBuilder());
        }
        int currRow = 0;
        boolean goingDown = false;