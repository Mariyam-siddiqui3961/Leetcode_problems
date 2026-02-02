//-------------Set Mismatch----------------------
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        int sum = 0;
        for(int num: nums){
            if(set.contains(num)){
                duplicate = num;
            }
            set.add(num);
            sum += num;
        }
        int n = nums.length;
        int expectedSum = n * (n+1)/2;

        int missing = expectedSum - (sum - duplicate);
        return new int[]{duplicate, missing};


    }
}