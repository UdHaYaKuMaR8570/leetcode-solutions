class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int st=0,ed=0;
        double x=0;
        double sum=0;
        double max = Double.NEGATIVE_INFINITY;
        while(ed<n)
        {
            sum+=nums[ed];
            if(ed-st+1==k)
            {
                x=sum/k;
                max=Math.max(max,x);
                sum-=nums[st];
                st++;
            }
            ed++;
        }
        return max;
    }
}