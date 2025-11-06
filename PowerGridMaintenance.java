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
        // Build component -> sorted operational stations
        Map<Integer, TreeSet<Integer>> onlineStations = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            int root = find(i, parent);
            onlineStations.computeIfAbsent(root, z -> new TreeSet<>()).add(i);
        }

        // For offline status
        boolean[] online = new boolean[c + 1];
        Arrays.fill(online, true);

        List<Integer> ans = new ArrayList<>();
        for (int[] q : queries) {
            int type = q[0], x = q[1];
            int root = find(x, parent);
            if (type == 1) {
                // Query: find a station to handle maintenance for x's grid
                if (online[x]) {
                    ans.add(x);
                } else {
                    TreeSet<Integer> set = onlineStations.get(root);
                    if (set == null || set.isEmpty()) ans.add(-1);
                    else ans.add(set.first());
                }
            } else {
                // type==2, set x offline and remove from TreeSet
                if (online[x]) {
                    online[x] = false;
                    TreeSet<Integer> set = onlineStations.get(root);
                    if (set != null) set.remove(x);
                }
            }
        }