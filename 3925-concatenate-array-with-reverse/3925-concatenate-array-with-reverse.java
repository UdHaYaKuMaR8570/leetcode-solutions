class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>tist=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(nums[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            tist.add(nums[i]);
        }
        list.addAll(tist);
        int []ans=new int [list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
        // for(int i=0;i<n;i++)
        // {
        //     // ans[i]=nums[i];
        //     ans[i+n]=nums[n-i-1];
        // }
        // return ans;
        // int res[]=new int [n];
        // int ans[]=new int [n];
        // int rev[]=new int[n*2];
        // for(int i=0;i<n;i++)
        // {
        //     ans[i]=nums[i];
        // }
        // for(int j=n-1;j>=0;j--)
        // {
        //     res[j]=nums[j];
        // }
        // for(int i=0;i<n;i++)
        // {
        //     rev[i]=ans[i]+res[i];
        // }
        // return rev;
    }
}