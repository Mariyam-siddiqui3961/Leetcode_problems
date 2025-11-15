//--------reverse string-----------
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i += 2*k){