package leetcode.swordoffer.offer64_sumNums;

/**
 * 剑指 Offer 64. 求1+2+…+n
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 *
 *
 * 示例 1：
 *
 * 输入: n = 3
 * 输出: 6
 * 示例 2：
 *
 * 输入: n = 9
 * 输出: 45
 */
public class SumNums_1 {
    static int res = 0;
    public static int sumNums(int n) {
        //当 n = 1 时 n > 1 不成立,就不会调用sumNums(n-1)了
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}
/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 59.12%
 * 的用户
 * 内存消耗：
 * 36 MB
 * , 在所有 Java 提交中击败了
 * 12.10%
 * 的用户
 */
