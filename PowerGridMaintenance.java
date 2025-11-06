//-------------power grid maintenance-----------
class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        // DSU Preparation
        int[] parent = new int[c + 1];
        for (int i = 1; i <= c; i++) parent[i] = i;

        // Merge function for DSU
        for (int[] edge : connections) {
            int u = find(edge[0], parent);
            int v = find(edge[1], parent);
            if (u != v) parent[v] = u;
        }