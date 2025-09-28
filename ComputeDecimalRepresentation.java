//---------------Decimal Representation -------------------------
class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> components = new ArrayList<>();
        int place = 1;

        while(n>0){
            int digit  = n % 10;
            if(digit != 0){
                components.add(digit * place);
            }
            n /= 10;
            place *= 10;
        }

        components.sort(Collections.reverseOrder());

        int[] result = new int[components.size()];
        for (int i = 0; i<components.size(); i++){
            result[i] = components.get(i);
        }
        return result;
    }
}