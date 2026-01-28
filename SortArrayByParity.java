//----------------sort array by parity-------------------
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int idx = 0;
        for(int num: nums){
            if(num % 2 == 0){
                res[idx++] = num;
            }
        }
        for(int num: nums){
            if(num %2 != 0){
                res[idx++] = num;
            }
        }
        return res;
        
    }
}