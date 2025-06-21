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