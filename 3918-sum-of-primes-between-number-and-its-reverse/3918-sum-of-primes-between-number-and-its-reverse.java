class Solution {
    public int sumOfPrimesInRange(int n) {
        int k=n;
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        int st=Math.min(k,rev);
        int end=Math.max(k,rev);
        int sum=0;
        for(int i=st;i<=end;i++)
        {
            if(isprime(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
    static boolean isprime(int n)
    {
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
}