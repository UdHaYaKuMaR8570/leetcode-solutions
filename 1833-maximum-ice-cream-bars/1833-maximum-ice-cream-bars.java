class Solution {
    public int maxIceCream(int[] arr, int co) {
        int n=arr.length;
        int c=0;
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum>co)
            {
               break;
            }
            c++;
        }
        return c;
    }
}