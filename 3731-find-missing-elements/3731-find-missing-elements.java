class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>fist=new ArrayList<>();
        int max=nums[0];
        int min=nums[0];
        for(int i:nums)
        {
            max=Math.max(max,i);
            min=Math.min(min,i);
            list.add(i);
        }
        for(int i=min;i<max;i++)
        {
            if(!list.contains(i))
            {
                fist.add(i);
            }
        }
        return fist;
    }
}