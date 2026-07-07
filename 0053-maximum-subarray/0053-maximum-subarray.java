class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int a=nums[0];
        int b=nums[0];
        for(int i=1;i<n;i++)
        {
            a=Math.max(nums[i],a+nums[i]);
            b=Math.max(a,b);
        }
        return b;
    }
}