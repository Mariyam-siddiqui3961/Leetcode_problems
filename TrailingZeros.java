//------------------Factorial Trailing Zeros-------------------
class Solution {
    public int trailingZeroes(int n) {
        int count =0;
        while (n>=5){
            n=n/5;
            count = count + n;
        }
        
      