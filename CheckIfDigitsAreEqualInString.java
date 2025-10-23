//-----------check if digits are equal in string-------------
class Solution {
    public boolean hasSameDigits(String s) {
        final int n = s.length();
        int num1 = 0, num2 = 0;
        for (int i = 0; i + 1 < n; ++i) {
             int coefficient = nCkMod10(n - 2, i);
            num1 = (num1 + coefficient * (s.charAt(i) - '0')) % 10;
            num2 = (num2 + coefficient * (s.charAt(i + 1) - '0')) % 10;
        }
        return num1 == num2;
    }
     // Returns (n choose k) % 10.
    private int nCkMod10(int n, int k) {
        int mod2 = lucas(n, k, 2);
        int mod5 = lucas(n, k, 5);
        int[][] lookup = {
            {0, 6, 2, 8, 4}, // mod2 == 0
            {5, 1, 7, 3, 9}  // mod2 == 1
            };
        return lookup[mod2][mod5];
    }

    // Lucas Theorem for (n choose k) mod p
    private int lucas(int n, int k, int p) {
        int res = 1;
        while (n > 0 || k > 0) {
            int nMod = n % p;
             int kMod = k % p;
            res = res * nCk(nMod, kMod) % p;
            n /= p;
            k /= p;
        }
        return res;
    }

    // Simple C(n, k)
    private int nCk(int n, int k) {
        if (k > n) return 0;
         if (k == 0 || k == n) return 1;
        int res = 1;
        for (int i = 0; i < k; ++i) {
            res = res * (n - i) / (i + 1);
        }
        return res;
    }
}
