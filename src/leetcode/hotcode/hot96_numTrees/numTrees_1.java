package leetcode.hotcode.hot96_numTrees;

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
public class numTrees_1 {
    public int numTrees(int n) {
        //G(n) = f(1) + f(2) + f(3) + .... + f(n)
        //f(i) = G(i - 1) * G(n - i)
        //G(n) =  G(0) * G(n-1) + G(1) * G(n - 2) + ..... + G(n-1) * G(0)
        //G[2] = G[0] * G[1] + G[1] * G[0]
        //G[3] = G[0] * G[2] + G[1] * G[1] + G[2]*G[0]
        int[] dp = new int[n + 1];
        dp[0] =  1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] += dp[j-1] * dp[i - j];
                //dp[2] = dp[0] * dp[1] + G[1] * G[0]
                //dp[3] = dp[0] * dp[2] + dp[1] * dp[1] + G[2] * G[0]
            }
        }
        return dp[n];
    }
}
