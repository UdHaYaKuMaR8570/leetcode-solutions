class Solution {
    public String maskPII(String s) {
        s=s.toLowerCase();
        String z="";
        int at=s.indexOf('@');
                if(at!=-1)
        {
        String a="";
        String b="";
        char c=s.charAt(0);
        char d=s.charAt(at-1);
        for(int i=at;i<s.length();i++)
        {
            a+=s.charAt(i);
        }
        for(int i=1;i<6;i++)
        {
            b+="*";
        }
        return c+b+d+s.substring(at);
        }
        for(char d:s.toCharArray())
        {
            if(Character.isDigit(d))
            {
                z+=d;
            }
        }
        int n=z.length();
        String l=z.substring(n-4);
        int count=n-10;
        String crack="";
        if(n==10)
        {
            return "***-***-"+l;
        }
            for(int i=0;i<count;i++)
            {
                crack+="*";
            }
            return "+"+crack+"-***-***-"+l;
    }
}