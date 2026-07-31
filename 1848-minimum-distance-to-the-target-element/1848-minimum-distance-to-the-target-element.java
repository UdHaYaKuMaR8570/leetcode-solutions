class Solution {
    public int getMinDistance(int[] arr, int t, int s) {
        int n = arr.length;
        int f = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == t) {
                ans = Math.min(ans, Math.abs(i - s));
                // f=arr[i];
                // break;
            }
        }
        return ans;
    }
}