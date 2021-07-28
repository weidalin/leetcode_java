package leetcode.swordoffer.offer43_countDigitOne;
/*
剑指 Offer 43. 1～n 整数中 1 出现的次数
输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。

例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。

示例 1：

输入：n = 12
输出：5
示例 2：

输入：n = 13
输出：6
 */
public class countDigitOne_3 {
    static int[] dp;
    public static int countDigitOne(int n) {
        
        // dp[i] = dp[i-] + getDigitOne(i)
        dp = new int[n + 1];
        dp[1] = 1;
        
        for(int i = 1; i <= n; i++){
            dp[i] = dp[i-1] + getDigitOne(i);
        }
        return dp[n];
    }

    private static int getDigitOne(int n) {
        int count = 0;
        while(n > 0){
            if(n % 10 == 1){
                count++;
            }
            n /= 10;
        }
        return count;
    }
//    private static int getDigitOne(int n) {
//        int n1 = Integer.parseInt(String.valueOf(n).charAt(0)+"");
//        int n2 = 0;
//        if(n > 10){
//            n2 = Integer.parseInt(String.valueOf(n).substring(1));
//        }
//
//        if(n1 == 1){
//            return dp[n2] + 1;
//        }else{
//            return dp[n2];
//        }
//    }

    public static void main(String[] args) {
        int n = 13;
        int res = countDigitOne(n);
        System.out.println(res);
    }
}
