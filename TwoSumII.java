//--------------Two Sum II ------------------
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int left =0, right=numbers.length-1;
//         while (left<right){
//             int sum= numbers[left] +numbers[right];
//             if (sum==target){
//                 return new int[]{left+1, right+1};
//                 }
//             else if(sum<target){
//                 left++;
//             }else{
//                 right--;
//             }
//         }
//         return new int[]{-1, -1};
//     }
// }

//----------------Two Sum------------------------------
int sum = 0;
        for (int i=0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){