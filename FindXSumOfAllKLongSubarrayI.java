//----find x-sum of all k-long subarray I------------
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int start = 0; start <= n - k; start++) {
            // Frequency array since nums[i] <= 50
            int[] freq = new int[51];

            // Count frequency of each number in the current window
            for (int i = start; i < start + k; i++) {
                freq[nums[i]]++;
            }

            // Create a list of (value, frequency)
            List<int[]> list = new ArrayList<>();
            for (int value = 1; value <= 50; value++) {
                if (freq[value] > 0) {
                    list.add(new int[]{value, freq[value]});
                }
            }

            // Sort by highest frequency, then largest value
            Collections.sort(list, (a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1]; // higher freq first
                 return b[0] - a[0]; // if freq same, bigger value first
            });

            // Take top x elements and compute sum
            int sum = 0;
            for (int i = 0; i < Math.min(x, list.size()); i++) {
                sum += list.get(i)[0] * list.get(i)[1];
                }

            result[start] = sum;
        }

        return result;
    }
}
