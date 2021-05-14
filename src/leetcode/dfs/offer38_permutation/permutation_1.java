package leetcode.dfs.offer38_permutation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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
    static char[] ch;
    static boolean[] ch_helper;
    public static String[] permutation(String s) {
        res = new HashSet<>();
        ch = s.toCharArray();
        ch_helper = new boolean[ch.length];
        dfs(ch, "");
        return res.toArray(new String[res.size()]);
    }

    private static void dfs(char[] ch, String str) {
        //1.结束条件
        if(str.length() == ch.length){
            res.add(str.toString());
        }
        //2.遍历所有可能性
        for(int i = 0; i < ch.length; i++){
            if(ch_helper[i] != true){
                //3.1选择他
                ch_helper[i] = true;
                //3.2深度遍历
                dfs(ch, str + ch[i]);
                //3.3 回溯
                ch_helper[i] = false;
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
