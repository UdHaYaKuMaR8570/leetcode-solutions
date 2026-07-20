class Solution {
    public String kthDistinct(String[] arr, int k) {
        // String Str[]=new String[arr.length()];
        int count=0;
        ArrayList<String>list=new ArrayList<>();
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for(String s:arr)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String b:map.keySet())
        {
            if(map.get(b)==1)
            {
                // str[k++];
                list.add(b);
            }
        }
        if(list.size()<k)
        {
            return "";
        }
        else
        {
             return list.get(k-1);
        }
        
            // }
        // else
        // {
        //     return arr[0]
        // }
        // return list.get(k-1);
        // for(String q:list)
        // {
        //     return q;
        // }
        // if(list.size()<k)
        // {
        //     return "";
        // }
        // return arr[0];
    }
}