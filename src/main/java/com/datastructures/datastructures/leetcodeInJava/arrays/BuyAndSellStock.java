package com.datastructures.datastructures.leetcodeInJava.arrays;

public class BuyAndSellStock {

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) buy = prices[i];
            int currentProfit = prices[i] - buy;
            if (currentProfit > maxProfit) maxProfit = currentProfit;
        }
        return maxProfit;
    }

    //TC: O(n), SC: O(1)


    public static void main(String[] args) {
        BuyAndSellStock stock = new BuyAndSellStock();
        int[] prices = {1,2};
        System.out.println(stock.maxProfit(prices));
    }
}
