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
        for(char ch : s.toCharArray()){
            rows.get(currRow).append(ch);
            //change direction only at first or last row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            //move pointer
            currRow += goingDown ? 1 : -1;
        
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row: rows){
        result.append(row);
        }
        return result.toString();
    }
}