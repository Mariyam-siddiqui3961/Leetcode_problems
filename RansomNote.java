//-------------Ransom Note-------------------
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
         HashMap<Character, Integer> map = new HashMap<>();
         // Count frequency of each char in magazine
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Check ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;  // Not enough of this character
            }