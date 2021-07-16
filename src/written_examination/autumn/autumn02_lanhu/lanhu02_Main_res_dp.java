package written_examination.autumn.autumn02_lanhu;

import java.util.Scanner;
import java.util.Stack;

/**
 * 力扣原题
 * https://leetcode-cn.com/problems/longest-valid-parentheses/submissions/
 * 32. 最长有效括号
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "(()"
 * 输出：2
 * 解释：最长有效括号子串是 "()"
 * 示例 2：
 *
 * 输入：s = ")()())"
 * 输出：4
 * 解释：最长有效括号子串是 "()()"
 * 示例 3：
 *
 * 输入：s = ""
 * 输出：0
 */
public class lanhu02_Main_res_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max_res = 0;
        int[] dp = new int[str.length()];
        for(int i  = 1; i < str.length(); i++){
            if(str.charAt(i) == ')'){
                if(str.charAt(i - 1) == '('){
                    dp[i] = (i>=2 ? dp[i-2] : 0) + 2;
                }else if(i - dp[i-1] > 0 && str.charAt(i - dp[i-1] - 1) == '('){
                    dp[i] = dp[i-1] + ((i-dp[i-1]) >= 2 ? dp[i-1] - 2 : 0) + 2;
                }
                max_res = Math.max(max_res, dp[i]);
            }
        }
        System.out.println(max_res);
//        return max_res;
    }
}
// )))()()))
// ()(()