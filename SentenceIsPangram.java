//--------------check if sentence is pangram------------------------
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;

        boolean[] seen = new boolean[26];