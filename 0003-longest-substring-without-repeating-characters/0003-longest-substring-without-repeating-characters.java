class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int left=0;
        // int max=0;
        // int []freq=new int[256];
        // for(int r=0;r<s.length();r++)
        // {
        //     char ch=s.charAt(r);
        //     freq[ch]++;
        //     while(freq[ch]>1)
        //     {
        //         char c=s.charAt(left);
        //         freq[c]--;
        //         left++;
        //     }
        //     max=Math.max(max,r-left+1);
        // }
        // return max;
        int left=0;
        int max=0;
        int freq[]=new  int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
            while(freq[s.charAt(i)]>1)
            {
                char c=s.charAt(left);
                freq[c]--;
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
        // LinkedHashSet<Character>str=new LinkedHashSet<>();
        // int left=0;
        // int max=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     while(str.contains(s.charAt(i)))
        //     {
        //         str.remove(s.charAt(left));
        //         left++;
        //     }
        //     str.add(s.charAt(i));
        //     max=Math.max(max,i-left+1);
        // }
        // return max;