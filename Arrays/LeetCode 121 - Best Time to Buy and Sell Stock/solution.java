class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {

//         int minPrice = prices[0];
//         int maxProfit = 0;

//         for (int i = 1; i < prices.length; i++) {

//             minPrice = Math.min(minPrice, prices[i]);

//             maxProfit = Math.max(
//                 maxProfit,
//                 prices[i] - minPrice
//             );
//         }

//         return maxProfit;
//     }
// }