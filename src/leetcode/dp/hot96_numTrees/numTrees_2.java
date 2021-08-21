package leetcode.dp.hot96_numTrees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

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
    public static int numTrees() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1, str.length());
        String[] list = str.split(",");
        HashSet<String> set = new HashSet<>();
        for(String s : list){
            set.add(s);
        }
        int M = list.length;
        int N = M - set.size() + 1;
        // A MN
        int multi = 1;
        while(M > N){
            multi *= M;
            M--;
        }
        int n = M;
        int[] dp = new int[n + 1];
        dp[0] =  1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] += dp[j-1] * dp[i - j];
            }
        }
        return dp[n] * multi;
    }

    public static void main(String[] args) {
        int res = numTrees();
        System.out.println(res);
    }
}

//[1,2]
//[1,2,3,4]