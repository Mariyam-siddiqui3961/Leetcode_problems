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
            // iterate wizards from n-2 down to 0 (we update prevWizardDone greedily for new potion j)
            for (int i = n - 2; i >= 0; --i) {
                // remove time of wizard i+1 for previous potion (we shift reference window)
                prevPotionDone -= (long) skill[i + 1] * (long) mana[j - 1];

                // The earliest finish time for wizard i (for potion j) cannot be earlier than:
                //  - prevPotionDone (the finishing time carried from the later wizard pipeline)
                //  - prevWizardDone - skill[i]*mana[j] (what was last wizard's finish reduced by new wizard's processing)
                prevWizardDone = Math.max(prevPotionDone,
                                          prevWizardDone - (long) skill[i] * (long) mana[j]);
            }

            // after computing adjustments, add the total time for all wizards to process potion j
            prevWizardDone += sumSkill * (long) mana[j];
        }

        return prevWizardDone;
    }
}