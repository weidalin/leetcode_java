package leetcode.dp.hard188_maxProfit;

import java.util.Arrays;

/*
给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

输入：k = 2, prices = [3,2,6,5,0,3]
输出：7
解释：在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
     随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class maxProfit_1 {
    /**
     * 动态规划
     * @param k
     * @param prices
     * @return
     * buy[i][j]、sell[i][j] 表示对于数组 prices[0..i] 中的价格而言，进行恰好 j 笔交易
     * 我们用 \textit{buy}[i][j]buy[i][j] 表示对于数组 \textit{prices}[0..i]prices[0..i] 中的价格而言，进行恰好 jj 笔交易，并且当前手上持有一支股票，这种情况下的最大利润；用 \textit{sell}[i][j]sell[i][j] 表示恰好进行 jj 笔交易，并且当前手上不持有股票，这种情况下的最大利润。
     *
     *
     * 状态转移方程：
     * buy[i][j]=max{buy[i−1][j],sell[i−1][j]−price[i]}
     *
     * 确定边界:
     * buy[0][1..k] 设置为一个非常小的值
     * 而对于buy[0][0]，它的值为 −prices[0]
     *
     */
    public static int maxProfit(int k, int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int n = prices.length;
        k = Math.min(k, n/2);
        int[][] buy = new int[n][k+1];
        int[][] sell = new int[n][k+1];

        buy[0][0] = -prices[0];
        sell[0][0] = 0;
        for (int i =1; i <= k; i++){
            buy[0][i] = sell[0][i] = Integer.MIN_VALUE / 2;
        }
        for (int i=1; i<n; i++){
            buy[i][0] = Math.max(buy[i-1][0], sell[i-1][0] - prices[i]);
            for (int j=1; j <= k; j++){
                buy[i][j] = Math.max(buy[i-1][j], sell[i-1][j] - prices[i]);
                sell[i][j] = Math.max(sell[i-1][j], buy[i-1][j-1] + prices[i]);
            }
        }
        return Arrays.stream(sell[n-1]).max().getAsInt();
    }
}
