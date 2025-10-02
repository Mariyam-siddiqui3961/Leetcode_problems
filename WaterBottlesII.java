//---------------------Water Bottles II----------------------
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrank = numBottles;   // Drink all initial full bottles
        int emptyBottles = numBottles; // All become empty after drinking
         // Keep exchanging while we have enough empty bottles
        while (emptyBottles >= numExchange) {
            // Exchange exactly once for the current numExchange
            emptyBottles = emptyBottles - numExchange + 1; // Subtract used bottles, add 1 new empty from drinking
            totalDrank += 1;                               // Count newly drunk bottle
            numExchange += 1;                              // Increment exchange value for next round
        }

        return totalDrank;
    }
}