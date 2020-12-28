package leetcode.labuladong.dp.dp322_coinChange;

import java.util.Arrays;

/*
322. 零钱兑换
给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
你可以认为每种硬币的数量是无限的。
示例 1：
输入：coins = [1, 2, 5], amount = 11
输出：3
解释：11 = 5 + 5 + 1
 */
public class coinChange_3 {
    /**
     * 自底向上 dp
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
        //1.自底向上
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i  = 1; i < amount + 1; i++){
            for(int coin : coins){
                if (i >= coin)
                    dp[i] = Math.min(dp[i-coin]+1, dp[i]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
/**
 *执行用时：
 * 15 ms
 * , 在所有 Java 提交中击败了
 * 65.69%
 * 的用户
 * 内存消耗：
 * 38 MB
 * , 在所有 Java 提交中击败了
 * 41.14%
 * 的用户
 */
