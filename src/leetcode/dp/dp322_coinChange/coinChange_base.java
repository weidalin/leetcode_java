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
public class coinChange_base {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return -1;
        int res = Integer.MAX_VALUE;
        for (int coin : coins){
            int subproblem = coinChange(coins,amount - coin);
            if (subproblem  == -1)  continue;//剪枝
            else
                res = Math.min(res, 1+subproblem);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
