//------------------Rotate Array--------------------
public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;   // handle if k > n