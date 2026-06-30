// class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int profit = 0;
//         for(int i=0; i<n ;i++){
//             for(int  j=i+1 ;j<n ;j++){
//                 profit = Math.max(profit, prices[j]-prices[i]);
//             }
//         }
//         return profit;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int n : prices){
            if(n < minPrice){
                minPrice = n;
            }
            maxProfit = Math.max(maxProfit , n - minPrice);
        }
        return maxProfit;
    }
}