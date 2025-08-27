//------------------Rotate Array--------------------
public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;   // handle if k > n
    for (int r = 0; r < k; r++) {   // repeat k times (outer loop)
        int last = nums[n - 1];     // save the last element
        for (int i = n - 1; i > 0; i--) {   // inner loop: shift everything right
            nums[i] = nums[i - 1];
