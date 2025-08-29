//----------------Valid Palindrome -----------------
class Solution {
    public boolean isPalindrome(String str) {
         str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int n = str.length();