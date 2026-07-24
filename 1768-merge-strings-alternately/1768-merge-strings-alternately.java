class Solution {
    public String mergeAlternately(String n, String x) {
        StringBuilder  sb = new StringBuilder();
        int i=0,j=0;
        while(i<n.length() && j<x.length())
        {
            sb.append(n.charAt(i));
            sb.append(x.charAt(j));
            i++;
            j++;
        }
        while(i<n.length())
        {
            sb.append(n.charAt(i));
            i++;
        }
        while(j<x.length())
        {
            sb.append(x.charAt(j));
            j++;
        }
        return  sb.toString();
    }
}