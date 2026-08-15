class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int n=arr.length;
        int c=0;
        int st=0;
        int ed=0;
        int sum=0;
        double avg=0;
        while(ed<n)
        {
            sum+=arr[ed];
            if(ed-st+1==k)
            {
                avg=sum/k;
                if(avg>=t)
                {
                    c++;
                }
                sum-=arr[st];
                st++;
            }
            ed++;
        }
        return c;
    }
}