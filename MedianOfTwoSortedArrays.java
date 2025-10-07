//-----------------Median of Two Sorted Arrays-------------
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int total = m + n;
        int mid1 = (total - 1) / 2;
        int mid2 = total / 2;