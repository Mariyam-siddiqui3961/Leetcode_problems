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
            }

        int maxFreq = 0, current = 0;
        // Sweep through all possible values
        for (int val : diff.keySet()) {
            current += diff.get(val);
            int possible = Math.min(current, freqMap.getOrDefault(val, 0) + numOperations);
             maxFreq = Math.max(maxFreq, possible);
        }
        return maxFreq;
    }
}
