package leetcode.dfs.hot301_removeInvalidParentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 301. 删除无效的括号
 * 给你一个由若干括号和字母组成的字符串 s ，删除最小数量的无效括号，使得输入的字符串有效。
 *
 * 返回所有可能的结果。答案可以按 任意顺序 返回。
 *
 * 示例 1：
 *
 * 输入：s = "()())()"
 * 输出：["(())()","()()()"]
 * 示例 2：
 *
 * 输入：s = "(a)())()"
 * 输出：["(a())()","(a)()()"]
 * 示例 3：
 *
 * 输入：s = ")("
 * 输出：[""]
 */
public class removeInvalidParentheses_2 {
    static int len;
    static String str;
    public static List<String> removeInvalidParentheses(String s) {
        len = s.length();
        str = s;
        Set<String> res = new HashSet<>();
        int leftRemove = 0, rightRemove = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '(')  leftRemove ++;
            else if(s.charAt(i) == ')'){
                if(leftRemove == 0){
                    rightRemove ++;
                }else{
                    leftRemove--;
                }
            }
        }
        dfs(0, 0, 0, leftRemove, rightRemove, "", res);
        return new ArrayList<>(res);
    }

    public static void dfs(int idx, int leftCount, int rightCount, int leftRemove, int rightRemove, String tmp, Set<String> res){
        // 0. 结束条件
        if(idx == len){
            if(leftRemove == 0 && rightRemove == 0) {
                res.add(tmp);
            }
            return;
        }
        // 1. 删除当前字符
        if(str.charAt(idx) == '(' && leftRemove > 0){
            dfs(idx + 1, leftCount, rightCount, leftRemove - 1, rightRemove,tmp, res);
        }
        if(str.charAt(idx) == ')' && rightRemove > 0){
            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove - 1,tmp, res);
        }
        // 2. 保留当前字符，分三种情况
        tmp = tmp+str.charAt(idx);
        // 2.1 保留（
        if(str.charAt(idx) == '('){
            dfs(idx + 1, leftCount+1, rightCount, leftRemove, rightRemove,tmp, res);
        }else if(str.charAt(idx) == ')') {
            // 保留 ）
            if (leftCount > rightCount)
                dfs(idx + 1, leftCount, rightCount + 1, leftRemove, rightRemove, tmp, res);
//            else{
//             剪枝啦，当rightCount >= leftCount时已经无解决
//              }
        }else{
            // 2.3 保留其他字符
            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove, tmp, res);
        }
    }
    public static void main(String[] args) {
        String str = "()())()";
        System.out.println(str);
        List<String> res  = removeInvalidParentheses(str);
        System.out.println(res);
    }

}
