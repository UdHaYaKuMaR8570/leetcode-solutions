class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int c = 0;

        while (i < n) {
            int sum = 0;
            j = i;

            while (j < n) {
                sum += arr[j];

                if (sum == k) {
                    c++;
                }

                j++;
            }

            i++;
        }

        return c;
    }
}