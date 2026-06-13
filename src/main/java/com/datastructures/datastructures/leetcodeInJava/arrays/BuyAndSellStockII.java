package com.datastructures.datastructures.leetcodeInJava.arrays;

public class BuyAndSellStockII {

    public int maxProfit(int[] prices) {
//        int buy = Integer.MAX_VALUE;
//        int profit = 0;
//        for (int i = 0; i < prices.length-1; i++) {
//            if(prices[i] < buy) buy = prices[i];
//            if(prices[i+1] > buy){
//                profit += prices[i+1]-buy;
//                buy = Integer.MAX_VALUE;
//            }
//        }
//        return profit;

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i-1] < prices[i]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }

    //TC: O(n), SC: O(1)

    public static void main(String[] args) {
        BuyAndSellStockII stockII = new BuyAndSellStockII();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(stockII.maxProfit(prices));
    }
}
