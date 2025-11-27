//--------------letter combination of phone number---------------
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) return result;

        String[] map = {
                "", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, new StringBuilder(), digits, map, result);
        return result;
    }

    private void backtrack(int index, StringBuilder path, String digits, String[] map, List<String> result) {
        // Base condition: if path length == digits length → complete combination
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        // Get letters for current digit
        int digit = digits.charAt(index) - '0';
        String letters = map[digit];

        // Try each letter
        for (char ch : letters.toCharArray()) {
            path.append(ch);                   // choose
