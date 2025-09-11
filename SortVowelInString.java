//------------sort vowel in string------------
class Solution {
    public String sortVowels(String s) {
        // Helper methos to check vowels
        java.util.Set<Character> vowels = new java.util.HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }
        // Collect vowels
        