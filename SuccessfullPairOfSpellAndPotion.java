//------------------successfull pair of spell and potions ----------------------
import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            // Minimum potion strength needed
            long required = (success + spell - 1) / spell; // ceiling division

            // Binary search for first potion >= required
            int idx = lowerBound(potions, required);
            
            answer[i] = m - idx; // remaining potions are successful
        }
        return answer;