package leetcode.dp.offer63_maxProfit;

/**
 * 剑指 Offer 63. 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 *
 *
 *
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class maxProfit_2 {
    public static int maxProfit(int[] prices) {
        //dp[i] = Math.max(dp[i-1], prices[i] - pre)
        int[] dp = new int[prices.length];
        if(prices.length == 0){
            return 0;
        }
        int pre = prices[0];
        dp[0] = 0;
        for(int i = 1; i < prices.length; i++){
            dp[i] = Math.max(dp[i-1], prices[i] - pre);
            if(prices[i] < pre){
                pre = prices[i];
            }
        }
        return dp[prices.length-1];
    }
}
/**
 执行用时：
 2 ms
 , 在所有 Java 提交中击败了
 66.17%
 的用户
 内存消耗：
 38.4 MB
 , 在所有 Java 提交中击败了
 41.55%
 的用户
 炫耀一下:
 */