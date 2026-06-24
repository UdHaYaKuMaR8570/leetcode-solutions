class Solution {
    public boolean validDigit(int n, int x) {
        char c=(char)(x+'0');
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c && s.charAt(0)!=c)
            {
                return true;
            }
        }
        return false;
    }
}