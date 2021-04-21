package written_examination.wangyi.wy2_zuidazixulie;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] powers = new int[n];
        for(int i = 0; i < n; i++){
            powers[i] = sc.nextInt();
        }
        int[] power_begin_with_plus = new int[n];
        int[] power_begin_with_neg = new int[n];
        int plus = 1;
        int neg = -1;
        for(int i = 0; i < n; i++){
            power_begin_with_plus[i] = powers[i] * plus;
            power_begin_with_neg[i] = powers[i] * neg;
            plus *= -1;
            neg *= -1;
        }

        //1. 数组0位置为+
        int plus_res = dp(power_begin_with_plus);

        //2. 数组0位置为-
        int neg_res = dp(power_begin_with_neg);
        System.out.println(Math.max(plus_res, neg_res));
    }

    private static int dp(int[] nums) {
        //dp[i] = Math.max(dp[i - 1] + nums[i] , nums[i])
        int cur = 0;
        for(int i = 0; i < nums.length; i++){
            cur = Math.max(cur + nums[i], nums[i]);
        }
        return cur;
    }
}
/**
10
1 2 3 4 5 6 7 8 9 10

10
1 -2 3 -4 5 -6 7 -8 9 -10

10
-1 -2 -3 -4 -5 -6 -7 -8 -9 -10
 */