//------------coupon code validator--------------
class Solution {
    public List<String> validateCoupons(
            String[] code, String[] businessLine, boolean[] isActive) {

        // Order of business lines
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};