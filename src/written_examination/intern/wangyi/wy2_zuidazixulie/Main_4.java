package written_examination.intern.wangyi.wy2_zuidazixulie;
import java.util.Scanner;

public class Main_4 {
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
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int neg = -1;
        for(int j = 1; j < nums.length; j++){
            int sum = dp[j-1] + nums[j] * neg;
            if(sum > nums[j]){
                dp[j] = sum;
                neg *= -1;
            }else{
                dp[j] = nums[j];
                neg = -1;
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++){
            if (dp[i] > res){
                res = dp[i];
            }

        }
        return res;
    }
}
/**
 *
 *
 * 62.5%
10
1 2 3 4 5 6 7 8 9 10

10
1 -2 3 -4 5 -6 7 -8 9 -10

10
-1 -2 -3 -4 -5 -6 -7 -8 -9 -10
 */