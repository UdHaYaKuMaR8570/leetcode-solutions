class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int krr[]=arr.clone();
        Arrays.sort(krr);
        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=1;
        for(int i:krr)
        {
            if(!map.containsKey(i))
            {
                map.put(i,rank);
                rank++;
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}