//------------Interleaving String----------------------
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        //length must be add up
        if (m+n!= s3.length()) return false;