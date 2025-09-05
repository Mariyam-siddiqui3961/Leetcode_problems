//---------Add Binary----------------------------
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i= a.length()-1;
        int j= b.length()-1;
        int carry=0;