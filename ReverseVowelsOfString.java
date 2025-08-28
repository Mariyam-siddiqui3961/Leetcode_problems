//----------------Reverse vowels of String----------------
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        String vowels = "aeiouAEIOU";