//--------------minimum absolute diff-------------------
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();