//---------------sort integer by binery reflection-------------
class Solution {
    public int[] sortByReflection(int[] nums) {
        int [][] arr = new int [nums.length][2];

        for(int i = 0; i< nums.length; i++){
            int num = nums[i];
            String bin = Integer.toBinaryString(num);
            String rev = new StringBuilder(bin).reverse().toString();
            int reflected = Integer.parseInt(rev, 2);

            arr[i][0]= num;
            arr[i][1] = reflected;
        }