class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int c = n + m;
        int arr[] = new int[c];
        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            arr[i + n] = nums2[i];
        }
        Arrays.sort(arr);
        int s = arr.length;
        if (s % 2 != 0) {
            return arr[c / 2];
        } else {
            return (double) (arr[c / 2] + arr[c / 2 - 1]) / 2;

        }
    }
}