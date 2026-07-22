class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int a = prefix[n - 1];
        for (int i = 0; i < n; i++) {
            int left;
            if (i == 0)
                left = 0;
            else
                left = prefix[i - 1];
            int right = a - left - nums[i];
            if(right==left)return i;
        }
        return -1;
    }
}