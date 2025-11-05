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

        long[] sumTop = new long[1]; // mutable inside lambdas

        // balance ensures top.size() <= x and top contains the best x nodes
        Runnable balance = () -> {
            // promote from rest until top has x items (or rest empty)
            while (top.size() < x && !rest.isEmpty()) {
                Node best = rest.pollFirst(); // best in rest
                top.add(best);
                sumTop[0] += 1L * best.val * best.freq;
            }

            // if top has more than x, demote worst
            while (top.size() > x) {
                Node worst = top.pollLast();
                rest.add(worst);
                sumTop[0] -= 1L * worst.val * worst.freq;
            }
            // swap while best in rest is strictly better than worst in top
            while (!top.isEmpty() && !rest.isEmpty()) {
                Node worstTop = top.last();   // worst among top
                Node bestRest = rest.first(); // best among rest

                // bestRest is better than worstTop if compareTo(bestRest, worstTop) < 0
                if (bestRest.compareTo(worstTop) < 0) {
                    // swap them
                    top.remove(worstTop);
                    rest.remove(bestRest);

                    sumTop[0] -= 1L * worstTop.val * worstTop.freq;
                    sumTop[0] += 1L * bestRest.val * bestRest.freq;

                    top.add(bestRest);
                    rest.add(worstTop);
                } else break;
            }
        };

        Consumer<Integer> add = (num) -> {
            int old = freq.getOrDefault(num, 0);
            if (old > 0) {
                Node oldNode = new Node(num, old);
                // remove the old node from whichever set it resides in
                if (top.remove(oldNode)) {
                    sumTop[0] -= 1L * oldNode.val * oldNode.freq;
                } else {
                    rest.remove(oldNode);
                }
            }
            int nw = old + 1;
            freq.put(num, nw);
            rest.add(new Node(num, nw)); // new node goes to rest, balance will handle promotion
            balance.run();
        };
