class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>tist=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                tist.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                list.add(nums[i]);
            }
        }
         tist.addAll(list);
        // int arr[]=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=tist.get(i);
        }
    }
}