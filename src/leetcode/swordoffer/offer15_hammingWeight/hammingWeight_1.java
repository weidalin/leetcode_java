package leetcode.swordoffer.offer15_hammingWeight;

/**
 * 剑指 Offer 15. 二进制中1的个数
 * 请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 *
 *
 *
 * 示例 1：
 *
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 */
public class hammingWeight_1 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int bitCount = Integer.bitCount(n);

        return bitCount;
    }
}
