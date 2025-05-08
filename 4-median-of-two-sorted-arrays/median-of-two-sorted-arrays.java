class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ar = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                ar[k++] = nums1[i++];
            } else {
                ar[k++] = nums2[j++];
            }
        }

        while (i < n) {
            ar[k++] = nums1[i++];
        }

        while (j < m) {
            ar[k++] = nums2[j++];
        }

        int total = n + m;
        if (total % 2 == 1) {
            return ar[total / 2];
        } else {
            return (ar[total / 2 - 1] + ar[total / 2]) / 2.0;
        }
    }
}
