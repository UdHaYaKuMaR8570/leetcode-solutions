class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int st=0;
        int ed=n-1;
        ArrayList<Integer>list=new ArrayList<>();
        while(st<ed)
        {
            int sum=0;
            sum+=(nums[st]+nums[ed]);
            list.add(sum);
            st++;
            ed--;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:list)
        {
            set.add(i);
        }
        return set.size();
    }
}