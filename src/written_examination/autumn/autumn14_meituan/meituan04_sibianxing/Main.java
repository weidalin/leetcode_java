package written_examination.autumn.autumn14_meituan.meituan04_sibianxing;

import java.util.Scanner;

/**
 * 第四道：四边形（100%）
 * 题目描述
 * 小美有一张无向器。特别会数数的小团册拿个难题考一下小美，于是他决定询问小美这张无向图中有多少个不同的四边形、无向图中的四边形由四个不同的点a，b，c，d和四条属于这张无向图的边(a，b)(b，c)(c，d)(d，a)组成，若两个四边形的点集和边集相同，则我们认为这两个四边形是同一个四边形，小美的这张无向图有点大，她期望你帮她算出这个难题的答案。
 *
 * 输入描述
 *
 * 第一行有一个整数n代表这张无向图中的点数。
 * 接下来n行给出这张无向图的邻接矩阵，每行有n个由空格隔开的整数，每个整数的值为0或1。
 * 输入保证对角元为0，即这张图没有自环。
 *
 * 6
 * 011100
 * 101010
 * 110001
 * 100011
 * 010101
 * 001110
 * 输出描述
 *
 * 输出一个整数，代表这张无向图中有多少个不同的四边形。
 *
 * 3
 */
// https://mp.weixin.qq.com/s/nLRZkDMgFMVJqyjf-navNg
public class Main {
    public static void main(String[] args) {
        // 枚举两个节点，计算有多少个相同的邻居节点，假设为m，组合数Cm2，res+=Cm2。最后答案为res/2。
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] nums = new int[n][n];
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            for(int j = 0; j < n; j++){
                nums[i][j] = chars[j] - '0';
            }
        }

        int res = getQuadrilateral(nums, n);
        System.out.println(res);
    }

    private static int getQuadrilateral(int[][] nums, int n) {
        int res = 0;
        for(int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int same = 0;
                for(int k = 0; k < n; k++){
                    if(nums[i][k] == 1 && nums[j][k] == 1)  same++;
                }
                res += same * (same - 1) / 2;
            }
        }
        return res / 2;
    }
}
/*
6
011100
101010
110001
100011
010101
001110

out:
3
 */
