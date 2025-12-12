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