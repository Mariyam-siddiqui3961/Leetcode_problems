//------------Maximum amount of time to brew potions---------------
class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long sumSkill = 0L;
        for (int s : skill) sumSkill += s;

        // Time for finishing potion 0 by last wizard if potion 0 starts at time 0
        long prevWizardDone = sumSkill * (long) mana[0];

        // process potions 1..m-1
        for (int j = 1; j < m; ++j) {
            // prevPotionDone represents finish time of wizard (n-1) for potion j-1
            long prevPotionDone = prevWizardDone;