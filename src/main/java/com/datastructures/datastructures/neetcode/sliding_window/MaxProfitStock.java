package com.datastructures.datastructures.neetcode.sliding_window;

public class MaxProfitStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 101;

        for (int price : prices ) {
            if(price < minPrice ){
                minPrice = price;
            }
            if(price-minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        MaxProfitStock maxProfitStock = new MaxProfitStock();
        System.out.println(maxProfitStock.maxProfit(prices));
    }
}
