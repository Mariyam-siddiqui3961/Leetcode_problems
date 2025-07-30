//------------------String COmpression---------------------
class Solution {
    public int compress(char[] chars) {
        int write = 0; // index to write in chars
        int anchor = 0; // start index of current group