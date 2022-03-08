package com.primary.a1_array;

/**
 * 买卖股票的最佳时机 II
 * 给定一个数组 prices ，其中 prices[i] 表示股票第 i 天的价格。
 *
 * 在每一天，你可能会决定购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润 。
 *
 * ****上升区间高度和****
 */
public class maxProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i+1] - prices[i] > 0){
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }
}
