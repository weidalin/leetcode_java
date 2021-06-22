package leetcode.hotcode.hot22_generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(n, n, "", list);
        return list;
    }
    public static void dfs(int left, int right, String str, List<String> list){
        // 过滤不符合条件的！！！
        if(left > right){
            return;
        }
        // 定义递归函数出口
        if(left == 0 && right == 0){
            list.add(str);
            return;
        }
        if(left > 0){ //还有左括号可以使用
            dfs(left - 1, right, str + "(", list);
        }
        if(right > 0){ // 还有右括号可以用
            dfs(left, right-1, str + ")", list);
        }
    }
}
