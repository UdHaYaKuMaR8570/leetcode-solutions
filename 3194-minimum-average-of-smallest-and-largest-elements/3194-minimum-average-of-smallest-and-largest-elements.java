class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int st=0;
        int ed=nums.length-1;
        ArrayList<Double>list=new ArrayList<>();
        while(st<ed)
        {
            double sum=0;
            sum+=(nums[st]+nums[ed])/2.0;
            list.add(sum);
            st++;
            ed--;
        }
        double min=list.get(0);
        for(double i:list)
        {
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }
}