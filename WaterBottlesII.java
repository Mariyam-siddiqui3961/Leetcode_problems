//---------------------Water Bottles II----------------------
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrank = numBottles;   // Drink all initial full bottles
        int emptyBottles = numBottles; // All become empty after drinking