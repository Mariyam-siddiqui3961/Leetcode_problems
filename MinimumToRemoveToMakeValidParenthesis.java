//--------------minimum to remove to make valid parenthesis------------------
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                open++;
                sb.append(c);
            }else if (c == ')'){
                if(open > 0){
                    open--;
                    sb.append(c);