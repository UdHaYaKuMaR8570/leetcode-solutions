class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=0;
        int b=0;
        for(int i=0;i<n/2;i++)
        {
            a=nums[i]+nums[n-1-i];
            b=Math.max(a,b);
        }
        return b;
    }
}