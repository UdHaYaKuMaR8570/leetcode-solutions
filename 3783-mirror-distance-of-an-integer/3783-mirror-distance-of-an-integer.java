class Solution {
    public int mirrorDistance(int n) {
        int k=n;
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        int nn=Math.abs(rev-k);
          return nn;
    }
}