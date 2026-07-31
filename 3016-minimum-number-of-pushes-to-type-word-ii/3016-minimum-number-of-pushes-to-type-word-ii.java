class Solution {
    public int minimumPushes(String word) {
        int k = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : map.values()) {
            list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            k += list.get(i) * (i / 8 + 1);
        }
        return k;
    }
}