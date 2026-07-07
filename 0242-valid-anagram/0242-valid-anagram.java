class Solution {
    public boolean isAnagram(String s, String t) {
        for (char c = 'a'; c <= 'z'; c++) {
            int a=0;
            int b=0;
            for (char ch : s.toCharArray()) {
                if (ch == c) {
                    a++;
                }
            }
            for (char ch : t.toCharArray()) {
                if (ch == c) {
                    b++;
                }
            }
            if (a != b) {
              return false;
            }
        }
        return true;
    }

}