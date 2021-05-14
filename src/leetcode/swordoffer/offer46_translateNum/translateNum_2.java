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
public class translateNum_2 {
    public static int translateNum(int num) {
        //dp[i] = dp[i-2] + dp[i-1]
        String str = String.valueOf(num);
        int[] dp = new int[str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= str.length(); i++){
            String tmp = str.substring(i - 2, i);
            if(tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i - 1];
            }
        }
        return dp[str.length()];
    }
}
