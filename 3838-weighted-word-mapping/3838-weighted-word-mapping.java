class Solution {
    public String mapWordWeights(String[] words, int[] weight) {
        int n = words.length;
        int m = weight.length;
        int rem=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), weight[i]);
        }
        String a = "";
        int mod=26;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String s = words[i];
            for (char c : s.toCharArray()) {
                sum += map.get(c);
            }
            rem=sum%26;
            a+=(char)('z'-rem);
        }
        return a;
    }
}