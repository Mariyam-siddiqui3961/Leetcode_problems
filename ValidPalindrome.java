//--------------Valid Palindrome--------------
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() -1;