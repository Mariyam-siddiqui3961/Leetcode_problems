//-----------Adjacent Increasing Subarray II--------------
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int ans = 0;
        int prev = 0, curr=1;
        for(int i = 1; i<n; i++){
            if(nums.get(i) > nums.get(i-1)){
                curr++;
            }else{
                ans = Math.max(ans, curr/2);
                ans= Math.max(ans, Math.min(prev, curr));
                prev = curr;
                curr = 1;
            }
        }
        ans = Math.max(ans, curr/2);
        ans = Math.max(ans, Math.min(prev, curr));
        return ans;
    }
}