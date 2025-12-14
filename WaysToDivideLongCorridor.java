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
                if (seatCount > 2 && seatCount % 2 == 1) {
                    ways = (ways * (plants + 1)) % MOD;
                    plants = 0;
                }
            } else if (seatCount >= 2 && seatCount % 2 == 0) {
                plants++;
            }
        }

        return (int) ways;
    }
}

