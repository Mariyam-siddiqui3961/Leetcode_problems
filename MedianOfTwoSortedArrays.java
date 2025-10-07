//-----------------Median of Two Sorted Arrays-------------
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int mid1 = (total - 1) / 2;
        int mid2 = total / 2;
        int i = 0, j = 0, count = 0;
        int num1 = 0, num2 = 0;

        while (count <= mid2) {
            int val;
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }
            if (count == mid1) num1 = val;
            if (count == mid2) num2 = val;
            count++;
        }

        if (total % 2 == 1) return num2;
        else return (num1 + num2) / 2.0;
    }
}