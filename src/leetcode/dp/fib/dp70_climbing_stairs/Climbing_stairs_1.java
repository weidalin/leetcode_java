package leetcode.dp.fib.dp70_climbing_stairs;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 */
public class Climbing_stairs_1 {
    // f(n) = f(n-1) + f(n-2)
    public static int climbStairs(int n) {
        if (n <= 2)
            return n;
        int pred1 = 0, pred2 = 0;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
/**
 * 执行结果：
 * 超出时间限制
 * 显示详情
 * 最后执行的输入：
 */
}
