package leetcode.labuladong.dp.dp509_fib;

/*509. 斐波那契数
斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
给定 N，计算 F(N)。



示例 1：

输入：2
输出：1
解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
 */
public class dp509_fib_2 {
    /**
     * 「备忘录」
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n < 1)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int cur  = 1;
        int pre = 1;
        int sum = -1;
        for (int i = 3; i <= n; i++){
            sum = pre + cur;
            pre = cur;
            cur = sum;
        }
        return cur;

    }
}
/**
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 35 MB
 * , 在所有 Java 提交中击败了
 * 82.71%
 * 的用户
 */
