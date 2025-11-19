//------------word break------------
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set <String> wordSet = new HashSet<>(wordDict);
        int n = s.length();