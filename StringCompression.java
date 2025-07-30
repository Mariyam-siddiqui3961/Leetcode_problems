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
                 // If group size > 1, write the count
                int count = read - anchor + 1;
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                 // Move anchor to the next group
                anchor = read + 1;
            }
        }

        return write;

    }
}