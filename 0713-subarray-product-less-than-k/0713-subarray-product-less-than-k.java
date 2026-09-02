class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int st=0;
        int ed=0;
        int c=0;
           int prod=1;
        if(k<=1)return 0;
        while(ed<nums.length)
        {
            // int prod=1;
            prod*=nums[ed];
            while(prod >=k  && st<=ed)
            {
                prod/=nums[st];
                st++;
            }

            count += ed - st + 1;
            ed++;
        }
        return count;

    }
}