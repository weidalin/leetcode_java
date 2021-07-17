package written_examination.autumn.autumn02_lanhu;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

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
public class lanhu02_Main_res_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = 0,left = 0, right = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')  left++;
            else if(s.charAt(i) == ')') right++;
            if(left == right)   res = Math.max(res, right * 2);
            else if(right > left)  left = right = 0;
        }
        left = 0; right = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '(')  left++;
            else if(s.charAt(i) == ')') right++;
            if(left == right)   res = Math.max(res, right * 2);
            else if(left > right)  left = right = 0;
        }
//        return res;

//        return maxans;
        System.out.println(res);
    }
}
// )))()()))
// "()(()"