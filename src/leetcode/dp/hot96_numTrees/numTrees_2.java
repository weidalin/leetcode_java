package leetcode.dp.hot96_numTrees;

/**
 * 96. 不同的二叉搜索树
 * 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：5
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：1
 */
public class numTrees_2 {
    public static int numTrees(int n) {
        /*
        G(n) = sum(F(i,n))
        F(i,n) = G(i-1) * G(n-i)
        G(n) = sum(G(i-1)*G(n-i)
        G(0) = 1
        G(1) = 1
         */
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int res = numTrees(3);
        System.out.println(res);
    }

}
