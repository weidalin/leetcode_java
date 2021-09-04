package written_examination.autumn.autumn14_meituan.meituan01_abString;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/5 12:09 上午
 */
// https://blog.csdn.net/weixin_41896265/article/details/120105359
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        if(n == 1 || n == 2){
            System.out.println(n == 1 ? 2 : 4);
        }else{
            int[] dp = new int[n+1];
            dp[1] = 2;
            dp[2] = 4;
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i-1]+dp[i-2]) % 998244353;
            }
            System.out.println(dp[n]);
        }
    }

}
