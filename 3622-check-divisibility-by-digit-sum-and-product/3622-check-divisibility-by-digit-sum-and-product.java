class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int og=n;
        while(n>0)
        {
            int d=n%10;
            sum+=d;
            mul*=d;
            n/=10;
        }
        int k=sum+mul;
        return og%k==0;
    }
}