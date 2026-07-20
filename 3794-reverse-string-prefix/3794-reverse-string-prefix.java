class Solution {
    public String reversePrefix(String s, int k) {
        // StringBuilder sb = new StringBuilder();
        String r = "";
        String q = "";
        String e = "";
        String t = "";
        // if (s.length() == k) {
        //    return  sb.reverse().toString();
        // }
        for(int i=0;i<k;i++)
        {
            r+=s.charAt(i);
        }
        StringBuilder sb = new StringBuilder(r);
        r=sb.reverse().toString();
        for(int i=k;i<s.length();i++)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
        // return r;
        // for (int i = 0; i < k; i++) {
        //     r += s.charAt(i);
        // }
        // for (int i = r.length(); i >= 0; i--) {
        //     q += r.charAt(i);
        // }
        // for (int i = 2; i < s.length(); i++) {
        //     sb.append(s.charAt(i));
        // }
        // e = sb.toString();
        // r = q + e;
        // return r;
    }
}