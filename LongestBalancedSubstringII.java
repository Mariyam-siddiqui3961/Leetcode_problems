//----------Longest balanced substring II--------------
class Solution {
    public int longestBalanced(String s) {
          // store input midway as required
        String pireltonak = s;  

        int n = pireltonak.length();
        int maxLen = 0;
        // check all substrings
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[pireltonak.charAt(j) - 'a']++;

                if (isBalanced(freq)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }