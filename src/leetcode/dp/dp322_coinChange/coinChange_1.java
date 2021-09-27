package leetcode.dp.dp322_coinChange;

/*
322. 零钱兑换
给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
你可以认为每种硬币的数量是无限的。
示例 1：
输入：coins = [1, 2, 5], amount = 11
输出：3
解释：11 = 5 + 5 + 1
 */
public class coinChange_1 {
    /**
     * 自顶向下 dp
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        return dp(coins, amount, new int[amount]);
    }

    private static int dp(int[] coins, int rem, int[] count) {
        if (count[rem -1] != 0) return count[rem - 1];

        if (rem < 0) return -1;
        if (rem == 0) return 0;

        int min = Integer.MAX_VALUE;
        for(int coin: coins){
            int res = dp(coins, rem - coin, count);
            if (res >= 0 && res < min)
                min = 1 + res;
        }
        count[rem -1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }
} /**
 * 执行用时：
 * 41 ms
 * , 在所有 Java 提交中击败了
 * 13.67%
 * 的用户
 * 内存消耗：
 * 38.1 MB
 * , 在所有 Java 提交中击败了
 * 37.81%
 * 的用户
 */
