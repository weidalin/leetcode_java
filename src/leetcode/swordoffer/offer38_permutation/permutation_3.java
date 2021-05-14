package leetcode.swordoffer.offer38_permutation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
public class permutation_3 {

    static List<String> res;
    static char[] ch;
    public static String[] permutation(String s) {
        res = new LinkedList<>();
        ch = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private static void dfs(int i) {
        //1.结束条件
        if (i == ch.length - 1){
            res.add(String.valueOf(ch));
//            return;
        }
        //2.选择列表
        Set<Character> set = new HashSet<>();
        for(int idx = i; idx < ch.length; idx++){
            if(set.contains(ch[idx]))
                continue;
            set.add(ch[idx]);
            //2.1选择
            swap(ch, idx, i);
            //2.2 进一步
            dfs(i + 1);
            //3.回溯
            swap(ch, idx, i);
        }
    }

    private static void swap(char[] ch, int idx, int i) {
        char tmp = ch[idx];
        ch[idx] = ch[i];
        ch[i] = tmp;
    }
}
/**
 * time:o(n^2)
 * space: o(n)
 * 执行用时：
 * 10 ms
 * , 在所有 Java 提交中击败了
 * 75.74%
 * 的用户
 * 内存消耗：
 * 43.8 MB
 * , 在所有 Java 提交中击败了
 * 27.57%
 * 的用户
 */
