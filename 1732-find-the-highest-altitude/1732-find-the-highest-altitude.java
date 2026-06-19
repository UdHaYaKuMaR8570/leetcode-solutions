class Solution {
    public int largestAltitude(int[] gain) {
        int rev = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            rev += gain[i];
            if (rev > max) {
                max = rev;
            }
        }
        return max;
    }
}