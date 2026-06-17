class Solution {
    public String processStr(String s) {
        StringBuilder  sb  = new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLowerCase(c))
            {
                sb.append(c);
            }
            else if(c=='*')
            {
                if(sb.length()>0)
                {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(c=='#')
            {
                sb.append(sb);
            }
            else
            {
                sb.reverse();
            }
        }
        return sb.toString();
        // forr(int  i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)=="*")
        //     {
        //         sb.deleteCharAt(sb.length()-1);
        //     }
        //     else if(s.charAt(i)=="#")
        //     {
        //         sb.append(i);
        //     }
        //     else if(s.charAt(i)=="%")
        //     {
        //         sb.reverse();
        //     }
        //     else
        //     {
        //         sb.append(s.char)
        //     }
        // }
        // int n = s.length();
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<n;i++)
        // {
        //     if(s.charAt(i)== '*')
        //     {
        //         if(sb.length()>0)
        //         sb.deleteCharAt(sb.length()-1);
        //     }
        //     else if(s.charAt(i)=='#')
        //     {
        //         sb.append(i);
        //     }
        //      else if(s.charAt(i)=='%')
        //     {
        //         sb.reverse();
        //     }
        //     else
        //     {
        //         sb.append(s.charAt(i));
        //     }
        // }
        // return sb.toString();
    }
}