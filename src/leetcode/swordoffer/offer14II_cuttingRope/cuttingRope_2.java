package leetcode.swordoffer.offer14II_cuttingRope;

/**
 * 剑指 Offer 14- II. 剪绳子 II
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m - 1] 。请问 k[0]*k[1]*...*k[m - 1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 */
public class cuttingRope_2 {
    public static int cuttingRope(int n) {



//
//        dp[i] = Math.max(dp[i-j] * (i - j), dp[i-j]*dp[j])
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i < n + 1;  i++){
            for(int j = 0; j < i; j++){
//                dp[i] = Math.max(j * (i-j), j * dp[i - j]);
//                int tmp = Math.max(dp[i], Math.max(j * (i-j), dp[i-j] * dp[i - j]));
                int tmp = Math.max((i-j) * (j), j*dp[i-j]);
                dp[i] = Math.max(dp[i], tmp);
                dp[i] %= 1000000007;
            }
        }
        return dp[n]%= 1000000007;
    }
}
