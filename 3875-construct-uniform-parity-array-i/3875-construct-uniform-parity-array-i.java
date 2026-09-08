class Solution {
    public boolean uniformArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int id=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            arr[i]=nums[i]-nums[j];
        }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                return true;
            }
        }
        return false;
    }
}