//------------sort vowel in string------------
class Solution {
    public String sortVowels(String s) {
        // Helper methos to check vowels
        java.util.Set<Character> vowels = new java.util.HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }
        // Collect vowels
        java.util.List<Character> vowelList = new java.util.ArrayList<>();
        for (char c: s.toCharArray()){
            if(vowels.contains(c)){
                vowelList.add(c);
            }
        }
        //sort vowels by ascii value
        java.util.Collections.sort(vowelList);
         //buils result
        StringBuilder result = new StringBuilder();
        int ind = 0; //pointer for vowel

        for (char c: s.toCharArray()){
            if(vowels.contains(c)){
                result.append(vowelList.get(ind++));
            }else{
                result.append(c);
            }
        }
        return result.toString();

    }
}