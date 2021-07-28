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
public class lanhu02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int res = 0;
        int cur_res = 0;
        for(char ch : str.toCharArray()){
            if(ch == '('){
                stack.add(ch);
            }else if(stack.isEmpty()){
                cur_res = 0;
            }else{
                stack.pop();
                cur_res+=2;
                res = Math.max(cur_res, res);
            }
        }
        System.out.println(res);
    }
}
// )))()()))
// "()(()"