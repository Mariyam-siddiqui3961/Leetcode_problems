//----------------------Water Bottle-----------------------
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;  // Initially drink all full bottles
        int empty = numBottles;       // All are now empty
        while (empty >= numExchange) {
            int newFull = empty / numExchange;   // how many new full bottles we get
            totalDrank += newFull;              // drink them
            empty = empty % numExchange + newFull; // leftover empty + new empty bottles
        }

        return totalDrank;
    }
}
