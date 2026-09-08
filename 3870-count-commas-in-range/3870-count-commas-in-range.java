class Solution {
    public int countCommas(int n) {
        int k=n;
        String a=String.valueOf(n);
        int m=a.length();
        if(m<4)
        {
            return 0;
        }
        return  k-1000+1;
        // for(int i=1000;i<=k;i++)
        // {

        // }
    }
}