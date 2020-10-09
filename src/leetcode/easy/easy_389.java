package leetcode.easy;

/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 */
public class easy_389 {


    /**
     * 执行用时：
     * 2 ms
     * , 在所有 Java 提交中击败了
     * 73.53%
     * 的用户
     * 内存消耗：
     * 37 MB
     * , 在所有 Java 提交中击败了
     * 63.25%
     * 的用户
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifferencev2(String s, String t) {
        char ann = t.charAt(t.length()-1);
        for (int i=0; i<s.length(); i++){
            ann += t.charAt(i)-s.charAt(i);
        }
        return ann;
    }
    /**
     * 执行用时：
     * 2 ms
     * , 在所有 Java 提交中击败了
     * 73.53%
     * 的用户
     * 内存消耗：
     * 37.1 MB
     * , 在所有 Java 提交中击败了
     * 54.99%
     * 的用户
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {
        char ann = t.charAt(t.length()-1);
        for (int i=0; i<s.length(); i++){
            ann ^= s.charAt(i);
            ann ^= t.charAt(i);
        }
        return ann;

    }
    public static void main(String[] args) {
        String s = "ss";
        String t = "ssy";
        char c = findTheDifferencev2(s, t);
        System.out.print(c);
    }
}
