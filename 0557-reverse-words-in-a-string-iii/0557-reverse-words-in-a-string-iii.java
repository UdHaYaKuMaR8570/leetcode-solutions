class Solution {
    public String reverseWords(String s) {
    //    String[]str=s.split(" ");//"Let's take LeetCode contest"===["Let's", "take", "LeetCode", "contest"]
    //    StringBuilder sb=new StringBuilder();
    //    for(int i=0;i<str.length;i++){//namma str array vehh sutha udrommm!split panatheey sutha vidromm!
    //     char[]arr=str[i].toCharArray();//aprm oru char  array  create pani antha words le iruka array ve ovoru char   ahh      edukromm!
    //      int x=0,j=arr.length-1;//two pointerss use panrom
    //        while(x<j){//swap panrooo!
    //         char temp=arr[x];
    //         arr[x]=arr[j];
    //         arr[j]=temp;
    //         x++;
    //         j--;
    //        }
    //        sb.append(new String(arr));//reverse ehh append  panroommm !
    //    if(i<str.length-1){//space kagaaa ithu use panuvom
    //    //0<1 space irukummm
    //    //1<1 no space bahiyaaaaaa 
    //     sb.append(" ");
    //    }
    // }
    //    return sb.toString();
    String arr[]=s.trim().split("\\s+");
    // for(int i=0;i<s.length();i++){
    //     char c=s.charAt(i);
    // }
    //     StringBuilder sb=new StringBuilder();
    //     sb.append(arr[i]);
    //     Collections.reverse().toString(); 
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<arr.length;i++){
     sb.append(new StringBuilder(arr[i]).reverse().toString());
        if(i<arr.length-1){
            sb.append(" ");
        }
    }
    return sb.toString();
    }
}