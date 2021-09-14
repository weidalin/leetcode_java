package written_examination.autumn.autumn20_bytedance.bytedance03_;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        int k = 1000;
//        int count = 0;
//        while(k > 1){
//            count ++;
//            k = k/ 2;
//        }
        int count = func(15);
        System.out.println(count);
    }

    private static int func(int n) {
        if(n == 1)  return 1;
        if(n == 2)  return 2;
        if(n == 3)  return 4;
        return func(n - 3) + func(n-2) + func(n-1);
//        if(n <= 1){
//            return 1;
//        }
//        int dp[] = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 4;
//        for(int i = 4; i <= n; i++){
//            dp[i] = dp[i - 1] + dp[i - 2] + dp[i-3];
//            dp[i] %= 1000000007;
//        }
//        return dp[n];
    }
}
