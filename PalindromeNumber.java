//-------------Palindrome Nmbers--------------
class Solution {
    public boolean isPalindrome(int x) {
         // if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        // int reversed = 0;
        // while (x > reversed) {
        //     reversed = reversed * 10 + x % 10;
        //     x = x / 10;
        // }
        // return x == reversed || x == reversed / 10;
        String str = Integer.toString(x);
        int i=0;
        int j=str.length()-1;
        while(i<j){
             if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
