package leetcode.swordoffer.offer46_translateNum;

/**
 * 剑指 Offer 46. 把数字翻译成字符串
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *
 *
 *
 * 示例 1:
 *
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 */
public class translateNum_1 {
    public static int translateNum(int num) {
        //dp[i] = dp[i-2] + dp[i-1]
        //       = dp[i-1]
        int a = 1, b = 1, x,y = num % 10;
        int c = 1;
        while(num > 0){
            num /= 10;
            x = num %  10;
            int tmp = x * 10 + y;
            if(tmp >= 10 && tmp <= 25){
                c = a + b;
            }else{
                c = a;
            }
            y = x;
            b = a;
            a = c;
        }
        return a;
    }
}
