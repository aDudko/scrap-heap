package main.java.richest_customer_wealth;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{new int[]{1,2,3}, new int[]{3,2,1}}));
        System.out.println(maximumWealth(new int[][]{new int[]{1,5}, new int[]{7,3}, new int[]{3,5}}));
        System.out.println(maximumWealth(new int[][]{new int[]{2,8,7}, new int[]{7,1,3}, new int[]{1,9,5}}));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxValue = 0;
        for (int i = 0; i < accounts.length; i++) {
            int localSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                localSum += accounts[i][j];
            }
            maxValue = Math.max(maxValue, localSum);
        }
        return maxValue;
    }
}
