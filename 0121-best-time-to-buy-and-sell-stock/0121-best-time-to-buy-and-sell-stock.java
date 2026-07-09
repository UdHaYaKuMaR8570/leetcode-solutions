class Solution {
    public int maxProfit(int[] prices) {
// int minprice=Integer.MAX_VALUE;
// int maxprofit=0;
// for(int i=0;i<prices.length;i++){
//     if(prices[i]<minprice){
// minprice=prices[i];
//     }
//     int p=prices[i]-minprice;
//     if(p>maxprofit){
//         maxprofit=p;
//     }
// }
// return maxprofit;
// int min=Integer.MAX_VALUE;
// int p=0;
// for(int i=0;i<prices.length;i++)
// {
//     if(prices[i]<min)
//     {
//         min=prices[i];
//     }
//     int pr=prices[i]-min;
//     if(pr>p)
//     {
//         p=pr;
//     }
// }
// return p;
int min=Integer.MAX_VALUE;
int p=0;
for(int i=0;i<prices.length;i++)
{
    if(prices[i]<min)
    {
        min=prices[i];
    }
    int pr=prices[i]-min;
    if(pr>p)
    {
        p=pr;
    }
}
return p;
// int minprice=prices[0];
// int maxprofit=0;
// for(int i=0;i<prices.length;i++){
//     if(prices[i]<minprice){
//         minprice=prices[i];
//     }
//     int profit=prices[i]-minprice;
//     if(profit>maxprofit){
//         maxprofit=profit;
//     }
// }
// return maxprofit;
// int minprice=prices[0];
// int maxprofit=0;
// int s=prices.length;
// for(int i=0;i<s;i++){
//     if(prices[i]<minprice){
//         minprice=prices[i];
//     }
//     int profit=prices[i]-minprice;
//     if(profit>maxprofit){
//         maxprofit=profit;
//     }
// }
// return maxprofit;
    }
}