//-----------maximum square area by removing fence----------------
class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        final int MOD = 1_000_000_007;

        // Add boundaries
        int[] H = new int[hFences.length + 2];
        int[] V = new int[vFences.length + 2];

        H[0] = 1;
        H[H.length - 1] = m;
        for (int i = 0; i < hFences.length; i++) {
            H[i + 1] = hFences[i];
        }

        V[0] = 1;
        V[V.length - 1] = n;
        for (int i = 0; i < vFences.length; i++) {
            V[i + 1] = vFences[i];
        }

        Arrays.sort(H);
        Arrays.sort(V);

        // Store all horizontal distances
        Set<Integer> hDistances = new HashSet<>();
        for (int i = 0; i < H.length; i++) {
            for (int j = i + 1; j < H.length; j++) {
                hDistances.add(H[j] - H[i]);
            }
        }

        int maxSide = 0;

        // Check vertical distances
        for (int i = 0; i < V.length; i++) {
            for (int j = i + 1; j < V.length; j++) {
                int d = V[j] - V[i];
                if (hDistances.contains(d)) {
                    maxSide = Math.max(maxSide, d);
                }
            }
        }

        if (maxSide == 0) return -1;

        long area = (long) maxSide * maxSide;
        return (int) (area % MOD);
    }
}
