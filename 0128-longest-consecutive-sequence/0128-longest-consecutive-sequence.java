class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int c = 0;
        int r = 0;
        int max =0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i : set) {
            if (!set.contains(i - 1)) {
                c = 1;
                int k=i;
                while (set.contains(i+ c)) {
                    c++;
                    k++;
                }
                max = Math.max(max, c);
            }
        }
        return max;
    }
}