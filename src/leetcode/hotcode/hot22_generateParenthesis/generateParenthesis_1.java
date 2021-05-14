package leetcode.hotcode.hot22_generateParenthesis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 *
 * 提示：
 *
 * 1 <= n <= 8
 */
public class generateParenthesis_1 {
    static List<String> res;
    public static List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        dfs(n,n, "");
        return res;
    }

    private static void dfs(int left, int right, String str) {
       if(left == 0 && right == 0){
           res.add(str);
           return;
       }
       if(left > right){
           System.out.println(str);
           return;
       }
       if(left > 0){
           dfs( left - 1, right, str + "(");
       }
       if(right > 0){
           dfs(left, right - 1, str + ")");
       }
    }
}
