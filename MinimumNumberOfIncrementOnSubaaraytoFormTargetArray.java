//-------------minimum number of increment on subarray to form target array---------------
class Solution {
    public int minNumberOperations(int[] target) {
        int operations = target[0];
        for(int i = 1; i< target.length; i++){
            if(target[i] >target[i-1]){