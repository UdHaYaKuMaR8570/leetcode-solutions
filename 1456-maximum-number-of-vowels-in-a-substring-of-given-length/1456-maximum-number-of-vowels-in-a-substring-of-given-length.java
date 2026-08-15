class Solution {
    public int maxVowels(String s, int k) {
        int st=0;
        int ed=0;
        int n=s.length();
        int c=0;
        int max=Integer.MIN_VALUE;
        while(ed<n)
        {
            if(vowel(s.charAt(ed)))
            {
                c++;
            }
            if(ed-st+1==k)
            {
                max=Math.max(max,c);
                if(vowel(s.charAt(st)))
                {
                    c--;
                }
                    st++;
                }
                ed++;
            }
            return max;
        }
    private static boolean vowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}