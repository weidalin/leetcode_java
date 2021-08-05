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
public class removeInvalidParentheses_3 {
    static int len;
    static String s;
    public static List<String> removeInvalidParentheses(String str) {
        len = str.length();
        s = str;
        Set<String> res = new HashSet<>();
        int leftRemove = 0, rightRemove = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                leftRemove ++;
            }else if(s.charAt(i) == ')'){
                if(leftRemove == 0){
                    rightRemove ++;
                }else{
                    leftRemove -- ;
                }
            }
        }
        dfs(0, 0, 0, leftRemove, rightRemove, res, "");
        return new ArrayList(res);
    }
    public static void dfs(int idx, int leftCount, int rightCount, int leftRemove,
                           int rightRemove, Set<String> res, String tmp){
        System.out.println(tmp + " left: " + leftRemove + " right: " + leftRemove + " res: " + res);
        if(idx == len){
            if(leftRemove == 0 && rightRemove == 0){
                res.add(tmp);
            }
            return;
        }
        char cur_ch = s.charAt(idx);
        // 1. 不留
        if(cur_ch == '(' && leftRemove > 0){
            dfs(idx + 1, leftCount, rightCount, leftRemove -1, rightRemove, res, tmp);
        }else if(cur_ch == ')' && rightRemove > 0){
            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove -1, res, tmp);
        }
        // 2 keep
        tmp = tmp + cur_ch;
        if(cur_ch == '('){
            dfs(idx + 1, leftCount + 1, rightCount, leftRemove, rightRemove, res, tmp);
        }else if(cur_ch == ')'){
            if(leftCount > rightCount)
                dfs(idx + 1, leftCount, rightCount+1, leftRemove, rightRemove, res, tmp);
        }else{
            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove, res, tmp);
        }


//        if(idx == s.length()){
//            System.out.println(tmp + " left: " + leftRemove + " right: " + leftRemove + " res: " + res);
//            if(leftRemove == 0 && rightRemove == 0)
//                res.add(tmp);
//            return;
//        }
//        // 1. 删除这个括号
//        if(s.charAt(idx) == '(' && leftRemove > 0){
//            dfs(idx + 1, leftCount, rightCount, leftRemove-1, rightRemove, res, tmp);
//        }else if(s.charAt(idx) == ')' && rightRemove > 0){
//            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove-1, res, tmp);
//        }
//        tmp = tmp + s.charAt(idx);
//        // 2. 保留这个括号
//        if(s.charAt(idx) == '('){
//            dfs(idx + 1, leftCount+1, rightCount, leftRemove, rightRemove, res, tmp);
//        }else if(s.charAt(idx) == ')'){
//            if(leftRemove > rightCount)
//                dfs(idx + 1, leftCount, rightCount+1, leftRemove, rightRemove, res, tmp);
//            // else{
//            // 剪枝
//            // }
//        }else{
//            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove, res, tmp);
//        }
    }
    public static void main(String[] args) {
        String str = "()())()";
        System.out.println(str);
        List<String> res  = removeInvalidParentheses(str);
        System.out.println(res);
    }

}
