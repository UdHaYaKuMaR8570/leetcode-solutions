class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        int arr[][]=new int[n][n];
        for(int j=0;j<n;j++)
        {
            int row=0;
            for(int i=n-1;i>=0;i--)
            {
                arr[j][row]=m[i][j];
                row++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                m[i][j]=arr[i][j];
            }
        }
    }
}