package leetcode.swordoffer.offer38_permutation;

import java.util.*;

/**
 * 剑指 Offer 38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 *
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 *
 * 示例:
 *
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 *
 * 限制：
 *
 * 1 <= s 的长度 <= 8
 */
public class permutation_1 {

    static Set<String> res;
    public static String[] permutation(String s) {
        res = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean[] help = new boolean[s.length()];
        dfs(s.toCharArray(), sb, res, s.length(), help);
        return res.toArray(new String[res.size()]);
    }

    private static void dfs(char[] str, StringBuilder sb, Set<String> res, int n, boolean[] help) {
        if(sb.length() == str.length && !res.contains(new String(sb))){
            res.add(new String(sb));
        }
        for(int i = 0; i < str.length; i++){
            if(help[i] != true){
                StringBuilder sb_tmp = new StringBuilder(sb);
                sb_tmp.append(str[i]);
                help[i] = true;
                dfs(str, sb_tmp, res, n, help);
                help[i] = false;
            }
        }
    }
}
/**
 * time:o(n^2)
 * space: o(n)
 * 执行用时：
 * 63 ms
 * , 在所有 Java 提交中击败了
 * 10.85%
 * 的用户
 * 内存消耗：
 * 46.1 MB
 * , 在所有 Java 提交中击败了
 * 5.02%
 * 的用户
 */
