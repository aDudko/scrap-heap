package com.leetcode.task.easy.best_time_to_buy_and_sell_stock;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(maxProfit(new int[]{7,6,5,1,2,3,4}));
    }

    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for (int price : prices) {
            buy = Math.min(buy, price);
            sell = Math.max(sell, price - buy);
        }
        return sell;

//        int result = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[j] - prices[i] > result) {
//                    result = prices[j] - prices[i];
//                }
//            }
//        }
//        return result;
    }
}
