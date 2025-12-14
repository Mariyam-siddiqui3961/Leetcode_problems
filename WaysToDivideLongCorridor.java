//------------number of ways to divide long corridor-------------
class Solution {
    public int numberOfWays(String corridor) {
        int MOD = 1_000_000_007;
        int seats = 0;

        // Count total seats
        for (char c : corridor.toCharArray()) {
            if (c == 'S') seats++;
        }

        // Invalid cases
        if (seats == 0 || seats % 2 != 0) return 0;

        long ways = 1;
        int seatCount = 0;
        int plants = 0;

        for (char c : corridor.toCharArray()) {
            if (c == 'S') {
                seatCount++;

                // When starting a new section

