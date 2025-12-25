//----------------------------Multiply String-------------------------
public class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
                // Perform multiplication
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int mul = (num1.charAt(m - 1 - i) - '0') * (num2.charAt(n - 1 - j) - '0');
                int pos = i + j;
                result[pos] += mul;
            }
        }
        
        // Handle carries
        int carry = 0;
        for (int k = 0; k < m + n; ++k) {
            int sum = result[k] + carry;
            result[k] = sum % 10;
            carry = sum / 10;
        }
        
        // Convert to string, skipping leading zeros
        StringBuilder ans = new StringBuilder();
        boolean leadingZero = true;
        for (int k = m + n - 1; k >= 0; --k) {
            if (result[k] != 0 || !leadingZero) {
                leadingZero = false;
                ans.append(result[k]);
            }
        }
        
        // If result is zero, return "0"
        if (ans.length() == 0) {
            return "0";
        }
        
        return ans.toString();
    }
}