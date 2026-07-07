class Solution {
    public long sumAndMultiply(int n) {
        int []arr=Integer.toString(n).chars().map(Character::getNumericValue).toArray();
        ArrayList<Integer>list=new ArrayList<>();
        long ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                list.add(arr[i]);
            }
        }
        long sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        long res=0;
        for(int a:list)
        {
            res=res*10+a;
        }
        ans=res*sum;
        return ans;
    }
}