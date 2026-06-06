class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] brr = new int[n];
        int[] ab = new int[n];
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = a;
            a += nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            brr[i] = b;
            b += nums[i];
        }
        for (int i = 0; i < n; i++) {
            ab[i] = Math.abs(arr[i] - brr[i]);
        }
        return ab;
    }
}