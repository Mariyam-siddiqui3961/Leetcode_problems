//-------------------sort colors----------------------
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int red = 0;
        int white = 1;
        int blue = 2;
        int[] res = new int [n];
        int idx =0;
 
        for(int num: nums){
            if(num == red){
                res[idx] = num;
                idx += 1;
            }
        }
        for(int num: nums){
            if(num == white){
                res[idx] = num;
                idx += 1;
            }
        }
