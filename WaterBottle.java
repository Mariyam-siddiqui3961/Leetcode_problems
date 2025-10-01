//----------------------Water Bottle-----------------------
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;  // Initially drink all full bottles
        int empty = numBottles;       // All are now empty