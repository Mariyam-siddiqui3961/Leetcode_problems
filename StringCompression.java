//------------------String COmpression---------------------
class Solution {
    public int compress(char[] chars) {
        int write = 0; // index to write in chars
        int anchor = 0; // start index of current group
        for (int read = 0; read < chars.length; read++) {
            // if it's the last character OR next character is different
            if (read + 1 == chars.length || chars[read] != chars[read + 1]) {
                // Write the character at anchor
                chars[write++] = chars[anchor];