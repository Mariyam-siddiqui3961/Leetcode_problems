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
        return maxLen;
    }

    // helper to check if all nonzero frequencies are equal
    private boolean isBalanced(int[] freq) {
        int count = 0;
        for (int f : freq) {
            if (f > 0) {
                if (count == 0) count = f;
                else if (count != f) return false;
            }
        }
        return count > 0;
    }
}