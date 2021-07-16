package leetcode.backtrack.hot301_removeInvalidParentheses;

import java.util.ArrayList;
import java.util.List;

public class removeInvalidParentheses_2 {
    public static List<String> removeInvalidParentheses(String s) {
        List<String> removed = new ArrayList<String>();
        remove(s, removed, '(', ')', 0, 0);
        return removed;
    }

    private static void remove(String s, List<String> removed, char opening, char closing, int i, int lastRemoved) {
        int count = 0;
        while (i < s.length() && count >= 0) {
            if (s.charAt(i) == opening) count++;
            else if (s.charAt(i) == closing) count--;
            i++;
        }
        if (count >= 0) {
            // 多了（
            s = new StringBuilder(s).reverse().toString();
            if (opening == '(') {
                remove(s, removed, closing, opening, 0, 0);
            } else
                removed.add(s);
        } else {
            // 多了）
            // 删除右括号
            for (int j = lastRemoved; j < i; j++) {
                if (s.charAt(j) == closing && (j == 0 || s.charAt(j - 1) != closing)) {
                    remove(s.substring(0, j) + s.substring(j + 1), removed, opening, closing, i - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "()())()";
        System.out.println(str);
        List<String> res  = removeInvalidParentheses(str);
        System.out.println(res);


    }
}
