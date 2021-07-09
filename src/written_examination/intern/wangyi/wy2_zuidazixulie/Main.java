package written_examination.intern.wangyi.wy2_zuidazixulie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] powers = new int[n];
        for(int i = 0; i < n; i++){
            powers[i] = sc.nextInt();
        }
        int res = dp(powers);
        System.out.println(res);
    }

    private static int dp(int[] nums) {
        //dp[j] = Math.max(dp[j-1] + nums[j] * pred, nums[j])
        //dp[j][0] =
        int[][] dp = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[0][1] = 0;
        int neg = -1;
        for(int j = 1; j < nums.length; j++){
            int sum = dp[j-1][0] + nums[j] * neg;
            if(sum > nums[j]){
                dp[j][0] = sum;
                neg *= -1;
            }else{
                dp[j][1] = nums[j];
                neg = -1;
            }

        }

        int res = 0;
        for (int i = 0; i < dp.length; i++){
            for(int j = 0; j < 2; j++){
                if (dp[i][j] > res){
                    res = dp[i][j];
                }
            }
        }
        return res;
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