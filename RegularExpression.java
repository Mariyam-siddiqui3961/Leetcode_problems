class Solution {
    public boolean isMatch(String s, String p) {
        Boolean [][] memo = new Boolean[s.length()+1] [p.length()+1];
        return dp(0,0,s,p,memo);
    }
    private boolean dp(int i, int j, String s, String p, Boolean[][] memo){
        if (memo [i][j] != null) return memo[i][j];
        
        if (j== p.length()){
            memo[i][j]= (i== s.length());
            return memo[i][j];
        }
         boolean firstMatch = ( i< s.length() && (s.charAt(i)== p.charAt(j) || p.charAt(j)== '.'));

        if (j+1 < p.length() && p.charAt(j+1)== '*'){
            memo[i][j]= (dp(i, j+2, s, p, memo) || (firstMatch && dp(i+1, j, s, p, memo)));
        } else {
            memo[i][j] = firstMatch && dp(i+1, j+1, s,p, memo);
        }
        return memo[i][j];
    }
}