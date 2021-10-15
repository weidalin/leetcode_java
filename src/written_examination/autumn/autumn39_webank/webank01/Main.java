package written_examination.autumn.autumn39_webank.webank01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/10/14 2:54 下午
 * 小A的高次方程
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 *     小A在做数学作业时，看到了这样一个题目：
 *
 *     求方程x3+y4+z5=k的一组正整数解(x,y,z)。
 *
 *     小A实在做不来这道题，于是他找你帮忙写一个程序来解决这个问题。由于你希望小A的作业让他自己做，你只需要判断是否存在解即可。
 *
 *
 *
 * 输入描述
 * 第一行一个正整数T，表示数据组数；
 *
 * 对于每一组数据，每行输入一个正整数k。
 *
 * 1≤T≤200,1≤k≤1012
 *
 * 输出描述
 * 对于每一组数据，若解存在，输出一行“YES”（不含引号）；否则，输出“NO”（不含引号）。
 *
 *
 * 样例输入
 * 3
 * 3
 * 25
 * 2
 * 样例输出
 * YES
 * YES
 * NO
 *
 * 提示
 * 第一组数据，可以找到解x=y=z=1；
 *
 * 第二组数据，可以找到解x=2,y=2,z=1；
 *
 * 第三组数据，无法找到解。
 */

public class Main {
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            list.add(k);
            if(k > max) max = k;
        }
        dp = new int[max][3];
        for(int i = 0; i < max; i++){
            dp[i][0] = (int)Math.pow(i, 3);
            dp[i][1] = dp[i][0] * i;
            dp[i][2] = dp[i][1] * i;
        }
        for(int k : list){
            int x = 1, y = 1, z = 1;

            boolean res = dfs(x,y,z,k);;
//            boolean res = func(k);
            if(res == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }


    }

    private static boolean dfs(int x, int y, int z, int k) {
        if(dp[x][0] + dp[y][1] + dp[z][2] == k){
            return true;
        }
        if(dp[x][0] + dp[y][1] + dp[z][2] > k){
            return false;
        }
        return dfs(x + 1, y, z, k) ||
                dfs(x, y + 1, z, k) ||
                dfs(x , y, z + 1, k);
    }
}
/*
3
3
25
2
 */