//----------------Avoid Flood in the City-----------------------
class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> fullLakes = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int lake = rains[i];
            if (lake == 0) {
                // mark this day as a dry day
                dryDays.add(i);
                ans[i] = 1; // default, might change later
            } else {
                ans[i] = -1; // raining day
                if (fullLakes.containsKey(lake)) {
                    // we need to find a dry day AFTER last time it was filled
                    int lastRainDay = fullLakes.get(lake);
                    Integer dryDay = dryDays.higher(lastRainDay);
                    if (dryDay == null) {
                        // no available dry day to prevent flood
                        return new int[0];
                    }
                    // assign this dry day to dry this lake
                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }