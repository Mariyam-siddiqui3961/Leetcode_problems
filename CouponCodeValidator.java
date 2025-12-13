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
        for (int i = 0; i < code.length; i++) {

            // Check isActive
            if (!isActive[i]) continue;

            // Check businessLine
            if (!priority.containsKey(businessLine[i])) continue;

            // Check code validity
            if (code[i].length() == 0) continue;
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            // Store valid coupon (businessLine, code)
            valid.add(new String[]{businessLine[i], code[i]});
        }

        // Sort based on businessLine priority and then code
        Collections.sort(valid, (a, b) -> {
            if (priority.get(a[0]) != priority.get(b[0])) {
                return priority.get(a[0]) - priority.get(b[0]);
            }
