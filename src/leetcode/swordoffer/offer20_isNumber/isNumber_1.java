package leetcode.swordoffer.offer20_isNumber;

/**
 * 剑指 Offer 20. 表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 *
 * 数值（按顺序）可以分成以下几个部分：
 *
 * 若干空格
 * 一个 小数 或者 整数
 * （可选）一个 'e' 或 'E' ，后面跟着一个 整数
 * 若干空格
 * 小数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 下述格式之一：
 * 至少一位数字，后面跟着一个点 '.'
 * 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
 * 一个点 '.' ，后面跟着至少一位数字
 * 整数（按顺序）可以分成以下几个部分：
 *
 * （可选）一个符号字符（'+' 或 '-'）
 * 至少一位数字
 * 部分数值列举如下：
 *
 * ["+100", "5e2", "-123", "3.1416", "-1E-16", "0123"]
 * 部分非数值列举如下：
 *
 * ["12e", "1a3.14", "1.2.3", "+-5", "12e+5.4"]
 *
 *
 * 示例 1：
 *
 * 输入：s = "0"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "e"
 * 输出：false
 * 示例 3：
 *
 * 输入：s = "."
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "    .1  "
 * 输出：true
 */
public class isNumber_1 {
    public static boolean isNumber(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        char[] chars = s.trim().toCharArray();
        boolean isNum = false, isDot = false, ise_or_E = false;
        for(int i = 0 ; i < chars.length; i++){
            if(chars[i] >= '0' && chars[i] <= '9'){
                isNum = true;
            }else if(chars[i] == '.'){
                if(isDot || ise_or_E){
                    return false;
                }
                isDot = true;
            }else if(chars[i] == 'e' || chars[i] == 'E'){
                if(!isNum || ise_or_E){
                    return false;
                }
                ise_or_E = true;
                isNum = false;
            }else if(chars[i] == '+' || chars[i] == '-'){
                if(i != 0 && chars[i-1] != 'e' && chars[i-1] != 'E'){
                    return false;
                }
            }else{
                return false;
            }
        }
        return isNum;
    }
}
