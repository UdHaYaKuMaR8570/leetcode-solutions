class Solution {
    public int maxCoins(int[] p) {
        int n=p.length;
        Arrays.sort(p);
        int i=0;
        int j=p.length-1;
        int sum=0;
        // int k=p.length-2;
        while(i<j)
        {
            sum+=p[j-1];
            i++;
            j-=2;
            // i++;
            // // j--;
            // // k-=2;
            // j-=2;
            // k-=2;
        }
        return sum;
    }
}