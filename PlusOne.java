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
                return digits; // Return the result if no carry is left
            }
        }
        
        // If we exit the loop, it means we have a carry that needs to be added
        // Create a new array with an extra space for the carry
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the first digit to 1
        return newDigits; // Return the new array
    }
}