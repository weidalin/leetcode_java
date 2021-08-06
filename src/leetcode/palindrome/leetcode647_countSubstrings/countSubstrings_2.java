package leetcode.palindrome.leetcode647_countSubstrings;

/**
 * 647. 回文子串
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 *
 * 示例 1：
 *
 * 输入："abc"
 * 输出：3
 * 解释：三个回文子串: "a", "b", "c"
 * 示例 2：
 *
 * 输入："aaa"
 * 输出：6
 * 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 */
public class countSubstrings_2 {
    public static int countSubstrings(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length() + 1; j++){
                String tmp = s.substring(i, j);
                if(is_Palindrome(tmp)){
                    res ++;
                }
            }
        }
        return res;
    }

    private static boolean is_Palindrome(String tmp) {
        int n = tmp.length();
        for(int i = 0; i < n/2; i++){
            if(tmp.charAt(i) != tmp.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}
