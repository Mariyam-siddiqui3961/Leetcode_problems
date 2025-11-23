//--------concatenate non zero digits and multiply by sum--------------
class Solution {
    public long sumAndMultiply(int n) {
        long x = 0L;
        int sum = 0;

        char[] digits = String.valueOf(n).toCharArray();
        
        for (int i = 0; i< digits.length; i++){
            if(digits[i] == '0') continue;
                int d = digits[i] - '0';