class Solution {
    public String mergeAlternately(String n, String x) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<n.length() || i<x.length())
        {
            if(i<n.length())
            {
                sb.append(n.charAt(i));
            }
            if(i<x.length())
            {
                sb.append(x.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}