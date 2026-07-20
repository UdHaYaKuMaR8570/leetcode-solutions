class Solution {
    public int countWords(String[] a, String[] b) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (String k : a) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        HashMap<String, Integer> cap = new HashMap<>();
        for (String k : b) {
            cap.put(k, cap.getOrDefault(k, 0) + 1);
        }
        for (String g : map.keySet()) {
            if (map.get(g) == 1 && cap.getOrDefault(g,0)==1) {
                count++;
            }
        }
        return count;
    }
}