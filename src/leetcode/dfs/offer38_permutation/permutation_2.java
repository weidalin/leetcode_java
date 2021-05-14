package leetcode.dfs.offer38_permutation;

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
public class permutation_2 {
    static List<String> res;
    static char[] ch;
    static boolean[] ch_help;
    public static String[] permutation(String s) {
        res = new ArrayList<>();
        ch = s.toCharArray();
        ch_help = new boolean[ch.length];
        Arrays.fill(ch_help, false);
        StringBuilder sb = new StringBuilder();
        dfs(0, sb);
        return res.toArray(new String[res.size()]);
    }

    private static void dfs(int i, StringBuilder sb) {
        if(sb.length() == ch.length){
            res.add(String.valueOf(sb));
        }
        Set<Character> set = new HashSet<>();
        for(i = 0; i < ch.length; i++){
            if(set.contains(ch[i]) || ch_help[i] == true){
                continue;
            }
            StringBuilder sb_tmp = new StringBuilder(sb);
            sb_tmp.append(ch[i]);
            set.add(ch[i]);
            ch_help[i] = true;
            dfs(i+1, sb_tmp);
            ch_help[i] = false;
        }
    }
}
