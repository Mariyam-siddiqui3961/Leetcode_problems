//--------------Generate Parenthesis--------------
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generate(result, "", 0, 0, n);
        return result;