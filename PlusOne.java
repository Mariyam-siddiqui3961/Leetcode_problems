//------------------------Plus one------------------------
class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        
        // Traverse the array from the last digit to the first
        for (i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0; // Set current digit to 0 if it's 9
            } else {
                digits[i]++; // Increment the current digit