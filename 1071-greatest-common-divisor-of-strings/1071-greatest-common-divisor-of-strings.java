class Solution {
    public String gcdOfStrings(String a, String b) {
        int two=b.length();
        int one=a.length();
        String c=a+b;
        String d=b+a;
        if(!c.equals(d))
        {
            return "";
        }
        while(two!=0)
        {
            int t=two;
            two=one%two;
            one=t;
        }
        return a.substring(0,one);
    }
}