class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int a = st.pop();
                int h = arr[a];
                int nse = i;
                int pse;
                if (st.isEmpty()) {
                    pse = -1;
                } else {
                    pse = st.peek();
                }
                int width = nse - pse - 1;
                int area = h * width;
                max = Math.max(max, area);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int a = st.pop();
            int h = arr[a];
            int nse = arr.length;
            int pse;
            if (st.isEmpty()) {
                pse = -1;
            } else {
                pse = st.peek();
            }
            int width = nse - pse - 1;
            int area = h * width;
            max = Math.max(max, area);
        }
        return max;
    }
}