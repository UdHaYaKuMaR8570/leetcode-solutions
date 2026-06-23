class Solution {
    public int minLengthAfterRemovals(String s) {
        // HashSet<Character>set=new HashSet<>();
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()!=c)
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        return st.size();
    }
}