//------------Next Greater Balanced Number-----------
class Solution {
    public int nextBeautifulNumber(int n) {
        for(int num =n+1; num<= 1224444; num++){
            if(isBalanced(num)) return num;
        }
        return -1;
    }