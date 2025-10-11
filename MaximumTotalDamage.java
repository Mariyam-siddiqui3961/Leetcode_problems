//----------------Maximum Total Damage------------------
class Solution {
    public long maximumTotalDamage(int[] power) {
           // Sum total damage per unique value
        Map<Integer, Long> sumMap = new HashMap<>();
        for (int p : power) {
            sumMap.put(p, sumMap.getOrDefault(p, 0L) + (long)p);
        }