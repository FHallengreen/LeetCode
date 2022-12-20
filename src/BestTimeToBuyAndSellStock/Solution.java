package BestTimeToBuyAndSellStock;

import static java.lang.Math.max;

public class Solution {

    public static int maxProfit(int[] prices) {

        int start = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices.length == 1){
                return 0;
            }
            if (prices[i] < start){
                start = prices[i];
            }
            else if (profit < prices[i] - start){
                profit = prices[i] - start;
            }
        }
    return profit;
    }

/*        int low = prices[0];
        int sell = 0;
        int lowIndex = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            profit = sell - low;
            if (prices[i] < low && i != prices.length - 1 && profit < prices[i] + low) {
                low = prices[i];
                lowIndex = i;
            }
            if (prices[i] > sell && prices[i] != low) {
                sell = prices[i];
            }
            if (low == prices[prices.length - 1] && prices.length < 2) {
                return 0;
            }
        }

        for (int i = lowIndex; i < prices.length; i++) {
            if (prices[i] > sell) {
                sell = prices[i];
            }
        }
        if (sell > low) {
            return sell - low;
        } else {
            return low - sell;
        }*/




    public static void main(String[] args) {

        int[] prices = {2,1,2,0,1};
        System.out.println(maxProfit(prices));
    }
}
