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
public class translateNum_3 {
    public static int translateNum(int num) {
        //dp[i] = dp[i-2] + dp[i-1]
        String str = String.valueOf(num);
        int a = 1, b = 1;
        for(int i = 2; i <= str.length(); i++){
            String tmp = str.substring(i - 2, i);
            int c = a;
            if(tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0){
                c = a + b;
            }else{
                c = a;
            }
            b = a;
            a = c;
        }
        return a;

    }
}
/**
 * 时间复杂度 O(N)O(N) ： NN 为字符串 ss 的长度（即数字 numnum 的位数 \log(num)log(num) ），其决定了循环次数。
 * 空间复杂度 O(N)O(N) ： 字符串 ss 使用 O(N)O(N) 大小的额外空间。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/solution/mian-shi-ti-46-ba-shu-zi-fan-yi-cheng-zi-fu-chua-6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
