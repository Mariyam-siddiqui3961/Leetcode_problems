//------------Next Greater Balanced Number-----------
class Solution {
    public int nextBeautifulNumber(int n) {
        for(int num =n+1; num<= 1224444; num++){
            if(isBalanced(num)) return num;
        }
        return -1;
    }
    private boolean isBalanced(int num){
        int[] count = new int[10];
        int temp = num;
        while(temp > 0){
            count[temp % 10] ++;
            temp /= 10;
        }