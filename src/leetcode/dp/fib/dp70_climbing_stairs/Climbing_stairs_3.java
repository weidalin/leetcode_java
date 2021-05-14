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
public class Climbing_stairs_3 {
    // f(n) = f(n-1) + f(n-2)
    public static int climbStairs(int n) {
        if (n <= 2)
            return n;
        int a = 2, b = 1;
        for(int i = 3; i <= n ; i++){
            int tmp = a;
            a = b + tmp;
            b = a;
        }
        return a;
    }
/**
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 34.9 MB
 * , 在所有 Java 提交中击败了
 * 94.16%
 * 的用户
 */
}
