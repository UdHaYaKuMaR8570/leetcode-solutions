class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int k=nums[nums.length-1];
        int q=nums[nums.length-2];
        int sum=(k-1)*(q-1);
        return sum;
        // int k=0;
        // int n=nums.length;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=i+1;j<=n;j++)
        //     {
        //         k=nums[i]-1*nums[j]-1;
        //     }
        // }
        // return  k;
    }
}