class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder bs = new StringBuilder();
        for(char  ch:s.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                sb.append(ch);
            }
            else
            {
                bs.append(ch);
            }
        }
        sb.reverse();
        bs.reverse();
        StringBuilder ans= new StringBuilder();
        int i=0;
        int j=0;
        for(char ch:s.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                ans.append(sb.charAt(i++));
            }
            else
            {
                ans.append(bs.charAt(j++));
            }
        }
        return ans.toString();
    }
}