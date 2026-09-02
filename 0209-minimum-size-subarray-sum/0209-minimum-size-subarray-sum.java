class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int st=0;
        int ed=0;
        int c=Integer.MAX_VALUE;
        int sum=0;
        while(ed<nums.length)
        {
            sum+=nums[ed];
            while(sum>=t)
            {
                c=Math.min(c,ed-st+1);
                sum-=nums[st];
                st++;
            }
            ed++;
        }
        if(c==Integer.MAX_VALUE)
        {
            return 0;
        }
        return c;
    }
}