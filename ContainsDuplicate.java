//------------Contains Duplicates-------------------
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//          HashSet<Integer> set = new HashSet<>();

//         for (int num: nums){
//             if (set.contains(num)){
//                 return true;
//                 }
//             set.add(num);
//             }
//         return false;
//     }
// }




// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums); // sort the array

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return true;   // found duplicate
//             }
//         }
//         return false; // no duplicate found
//     }
// }






class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right= 0;

        for(int i = 0; i<=n; i++){
            if(nums[left] != nums[right]){
                left++;
                return true;
            }else{
                right++;
            }
        }
        return false;
    }
}