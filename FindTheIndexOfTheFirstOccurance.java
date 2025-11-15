//--------------Find the index of the occurance----------------
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i<= n-m; i++){
            int j = 0;