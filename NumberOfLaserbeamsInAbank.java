//------NUmber of laser beam in a bank------------
class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int totalBeam = 0;
         for (String row : bank) {
            int curr = 0;
            for( char c: row.toCharArray()){
                if(c=='1') curr++;