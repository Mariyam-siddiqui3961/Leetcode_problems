//------------coupon code validator--------------
class Solution {
    public List<String> validateCoupons(
            String[] code, String[] businessLine, boolean[] isActive) {

        // Order of business lines
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        // Map business line to priority number
        Map<String, Integer> priority = new HashMap<>();
        for (int i = 0; i < order.length; i++) {
            priority.put(order[i], i);
        }

        // List to store valid coupons
        List<String[]> valid = new ArrayList<>();
