package written_examination.autumn.autumn05_rongyao.rongyao1_maidingzi;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/21 6:52 下午
 */

public class Main_errorVersion {
    static final int num1 = 4;
    static final int num2 = 9;
    static int res;
    public static void main(String[] args) {
        res = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 13;
        dfs(n, 0, 0);
        res = res == Integer.MAX_VALUE ? -1 : res;
        System.out.println(res);
    }

    private static void dfs(int n, int i, int cur) {
        if(cur >= n){
            if(cur == n)
                res = Math.min(res, cur);
            return;
        }
        dfs(n, i+1, cur+num1);
        dfs(n, i+1, cur+num2);
    }
}
