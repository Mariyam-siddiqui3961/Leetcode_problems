//------------minimum fre of an element after operation ----------------
public class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        TreeMap<Integer, Integer> diff = new TreeMap<>();