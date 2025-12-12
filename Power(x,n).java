//------------power (x,n)----------------
class Solution {
    public double myPow(double x, int n) {

        // If power is negative, invert x and convert n to positive
        long pow = n; 
        if (pow < 0) {
            x = 1 / x;
            pow = -pow;
        }

        double result = 1;

        // Fast exponentiation
        while (pow > 0) {
            if ((pow & 1) == 1) {  
                result *= x;        // multiply when last bit is 1
            }
            x *= x;                // square the base
            pow >>= 1;             // move to next bit
        }

        return result;
    }
}
