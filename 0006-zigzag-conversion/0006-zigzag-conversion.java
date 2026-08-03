class Solution {
    public String convert(String s, int n) {
        if(n==1)return s;
        StringBuilder sb[] = new StringBuilder[n];
        int push = 0;
        boolean down = true;
        for (int i = 0; i < n; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            sb[push].append(s.charAt(i));
            if (down) {
                if (push == n - 1) {
                    down = false;
                    push--;
                } else {
                    push++;
                }
            }
                else {
                    if (push == 0) {
                        down = true;
                        push++;
                    } else {
                        push--;
                    }
                }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder k : sb) {
            ans.append(k);
    }
        return ans.toString();
    }
}