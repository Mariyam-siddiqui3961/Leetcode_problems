//------------minimum fre of an element after operation ----------------
public class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        TreeMap<Integer, Integer> diff = new TreeMap<>();
        // Prepare frequency and difference map
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            diff.putIfAbsent(num, 0);
            diff.put(num - k, diff.getOrDefault(num - k, 0) + 1);
            diff.put(num + k + 1, diff.getOrDefault(num + k + 1, 0) - 1);