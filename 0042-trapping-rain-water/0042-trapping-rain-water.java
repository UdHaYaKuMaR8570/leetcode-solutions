class Solution {
    public int trap(int[] h) {
        int n = h.length;
        if(n<=2)return 0;
        int leftmax=h[0];
        int k=0;
        int ans=0;
        int water=0;
        Stack<Integer> st = new Stack<>();
        st.push(h[n-1]);
        for (int i = n - 2; i >= 2; i--) {
            st.push(Math.max(h[i],st.peek()));
        }
        for(int i=1;i<n-1;i++)
        {
            
            k=Math.min(leftmax,st.peek());
            ans=k-1;
            water+=Math.max(0,k-h[i]);
            st.pop();
            leftmax=Math.max(leftmax,h[i]);
        }
        return  water;
    }
}