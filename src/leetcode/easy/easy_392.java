package leetcode.easy;

/**
 * 392. 判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 *
 * 返回 true.
 *
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 *
 * 返回 false.
 */
public class easy_392 {

    /**
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 36.5 MB
     * , 在所有 Java 提交中击败了
     * 86.04%
     * 的用户
     * @param s
     * @param t
     * @return
     */
    public static  boolean isSubsequence(String s, String t) {
        int t_index = 0;
        for (int i=0; i<s.length(); i++){
            char s_item = s.charAt(i);
            t_index = t.indexOf(s_item, t_index);
            if (t_index == -1)
                return false;
            else
                t_index++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        boolean res = isSubsequence(s, t);
        System.out.println(res);

    }
}
