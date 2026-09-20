class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int reverse=26-(s.charAt(i)-'a');////26-(97-97)=26,26-(98-97)=25
            sum+=reverse*(i+1);//26*(0+1)=26,25(1+1)=50//50+26=76
        }
        return sum;
    }
}