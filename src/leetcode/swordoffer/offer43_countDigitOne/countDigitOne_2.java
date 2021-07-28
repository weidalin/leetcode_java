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
public class countDigitOne_2 {
    public static int countDigitOne(int n) {
        if(n == 1)  return 1;
        // dp[i] = dp[i-] + getDigitOne(i)
        int a = 1, b = 0;
        for(int i = 2; i <= n; i++){
            b = a + getDigitOne(i);
            a = b;
        }
        return b;
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

    public static void main(String[] args) {
        int n = 824883294;
//        int n = Integer.MAX_VALUE;
        int res = countDigitOne(n);
        System.out.println(res);
    }
}
