class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int c=0,sum=0;
        for(int i:nums)
        {
            sum+=i;
            int x=sum%k;
            if(x<0)
            {
                x+=k;
            }
            if(map.containsKey(x))
            {
                c+=map.get(x);
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return c;
    }
}