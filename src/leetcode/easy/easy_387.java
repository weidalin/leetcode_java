package leetcode.easy;

import java.util.HashMap;

/**
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 */
public class easy_387 {

    /**
     * 执行用时：
     * 6 ms
     * , 在所有 Java 提交中击败了
     * 88.82%
     * 的用户
     * 内存消耗：
     * 39.2 MB
     * , 在所有 Java 提交中击败了
     * 82.90%
     * 的用户
     * @param s
     * @return
     */
    public static int firstUniqCharv2(String s) {
        int[] count = new int[26];
        //build
        int n = s.length();
        for (int i=0; i<n; i++){
            char c = s.charAt(i);
            count[c-97]++;
        }
        for (int i=0; i<n; i++){
            char c = s.charAt(i);
            if (count[c-97] == 1)
                return i;
        }
        return -1;
    }
    /**
     * 执行用时：
     * 33 ms
     * , 在所有 Java 提交中击败了
     * 52.14%
     * 的用户
     * 内存消耗：
     * 39.6 MB
     * , 在所有 Java 提交中击败了
     * 25.22%
     * 的用户
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        //build hashMap
        for (int i=0; i<n; i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        for (int i=0; i<n; i++){
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
    public  static void main(String[] args) {
        int res = firstUniqCharv2("khksahdkvnba");
        System.out.print(res);
    }
}
