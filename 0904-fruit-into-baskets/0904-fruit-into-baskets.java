class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int st=0;
        int ed=0;
        int max=Integer.MIN_VALUE;
        while(ed<f.length)
        {
            int k=f[ed];
            map.put(k,map.getOrDefault(k,0)+1);
            while(map.size()>2)
            {
                int l=f[st];
                map.put(l,map.get(l)-1);
                if(map.get(l)==0)
                {
                    map.remove(l);
                }
                st++;
            }
            max=Math.max(max,ed-st+1);
            ed++;
        }
        return max;
    }
}