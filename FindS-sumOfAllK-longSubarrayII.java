//---------find x-sum of all k-long subarrayII----------
import java.util.*;
import java.util.function.Consumer;

class Solution {

    static class Node implements Comparable<Node> {
        int val;
        int freq;
        Node(int v, int f) { val = v; freq = f; }

         // Order: higher freq first. If equal freq, higher val first.
        @Override
        public int compareTo(Node o) {
            if (this.freq != o.freq) return Integer.compare(o.freq, this.freq);
            return Integer.compare(o.val, this.val);
        }

        // helpful for TreeSet.remove(...) to find exact node
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Node)) return false;
            Node p = (Node) o;
            return this.val == p.val && this.freq == p.freq;
        }
        @Override
        public int hashCode() {
            return Objects.hash(val, freq);
        }
    }

    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] ans = new long[n - k + 1];

        Map<Integer, Integer> freq = new HashMap<>();
        TreeSet<Node> top = new TreeSet<>();   // holds up to x best nodes
        TreeSet<Node> rest = new TreeSet<>();  // holds the others