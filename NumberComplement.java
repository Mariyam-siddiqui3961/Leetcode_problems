//--------------------Number Complement-----------------
class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String res = "";

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
