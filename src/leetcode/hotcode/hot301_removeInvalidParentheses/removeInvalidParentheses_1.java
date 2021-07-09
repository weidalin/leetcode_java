package leetcode.hotcode.hot301_removeInvalidParentheses;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        dfs(s, res, '(', ')', 0, 0);
        return res;

    }

    private void dfs(String s, List<String> res, char opening, char closing, int i, int lastRemove) {
        int count = 0;
        while(i < s.length() && count >= 0){
            if(s.charAt(i) == opening){
                count++;
            }else if(s.charAt(i) == closing){
                count --;
            }
            i++;
        }

        if(count < 0){
            for(int j = lastRemove; j < i; j++){
                // 多了), 删除他并且dfs
                if(s.charAt(j) == closing && (j == 0 || s.charAt(j - 1) != closing)){
                    dfs(s.substring(0,j) + s.substring(j + 1), res, opening, closing,i - 1,j);
                }
            }
        }else if(count > 0){
            // 多了 ( , 需要从右到左去删除
            dfs(new StringBuilder(s).reverse().toString(), res, closing, opening, 0, 0);
        }else{
            // 平衡， 添加到res
            if(opening == '('){
                res.add(s);
            }else{
                res.add(new StringBuilder(s).reverse().toString());
            }

        }
    }
}
