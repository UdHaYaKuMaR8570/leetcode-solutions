class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
       int  temp[]=new int [n];
        k%=n;
        for(int i=0;i<k;i++)
        {
            temp[i]=arr[n-k+i];
        }
        for(int i=0;i<n-k;i++)
        {
            temp[i+k]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }
}