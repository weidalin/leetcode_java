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
public class removeInvalidParentheses_1 {
    static int len;
    static char[] charArray;
    static Set<String> validExpressions = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        this.len = s.length();
        this.charArray = s.toCharArray();

        // 1. 遍历一次，计算多余的左右括号
        int leftRemove = 0;
        int rightRemove = 0;
        for(int i = 0; i < len; i++){
            if(charArray[i] == '('){
                leftRemove ++;
            }else if(charArray[i] == ')'){
                if(leftRemove == 0){
                    rightRemove++;
                }if(leftRemove > 0){
                    leftRemove--;
                }
            }
        }
        // 2. 回溯，尝试每一种可能的删除操作
        StringBuilder path = new StringBuilder();
        dfs(0, 0, 0, leftRemove, rightRemove, path);
        return new ArrayList<>(this.validExpressions);
    }

    private void dfs(int idx, int leftCount, int rightCount, int leftRemove, int rightRemove, StringBuilder path) {
        if(idx == len){
            if(leftRemove == 0 && rightRemove == 0){
                validExpressions.add(path.toString());
            }
            return;
        }
        char ch = charArray[idx];
        // 1. 删除当前遍历到的字符
        if(ch == '(' && leftRemove > 0){
            dfs(idx + 1, leftCount, rightCount, leftRemove - 1, rightRemove, path);
        }
        if(ch == ')' && rightRemove > 0){
            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove - 1, path);
        }
        // 2. 保留当前遍历到的字符
        path.append(ch);
        if(ch != '(' && ch != ')'){
            dfs(idx + 1, leftCount, rightCount, leftRemove, rightRemove, path);

        }else if(ch == '('){
            dfs(idx + 1, leftCount + 1, rightCount, leftRemove, rightRemove, path);
        }else if(rightCount < leftCount){
            dfs(idx + 1, leftCount, rightCount + 1, leftRemove, rightRemove, path);
        }
        // 回溯
        path.deleteCharAt(path.length() - 1);
    }
}
