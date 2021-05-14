package leetcode.swordoffer.offer44_findNthDigit;

/**
 * 剑指 Offer 44. 数字序列中某一位的数字
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 *
 * 请写一个函数，求任意第n位对应的数字。
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：3
 * 示例 2：
 *
 * 输入：n = 11
 * 输出：0
 */
public class findNthDigit_2 {
    public static int findNthDigit(int n) {
        int tmp = 0;
        int i = -1;
        while(true){
            String str_tmp = String.valueOf(tmp);
            if(i + str_tmp.length() < n){
                i += str_tmp.length();
                tmp += 1;
            }else if(i + str_tmp.length() >= n){
                System.out.println(i + " " + str_tmp + " length_reach:" + (i + str_tmp.length()));
                System.out.println("res: " + str_tmp.substring(n - i-1, n - i ));
                return Integer.valueOf(str_tmp.substring(n - i - 1, n - i));
            }
        }
    }
}
/**
 *超时
 */
