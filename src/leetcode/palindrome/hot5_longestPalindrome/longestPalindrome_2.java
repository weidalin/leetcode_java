package leetcode.palindrome.hot5_longestPalindrome;


/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 *
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ac"
 * 输出："a"
 */
public class longestPalindrome_2 {
    /**
     * 暴力
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {

        if(s.length() <= 1){
            return s;
        }
        int len = s.length();
        for(int lenght = len; lenght > 0; lenght--){
            for(int left = 0; left + lenght - 1 < len; left ++){
                int right = left + lenght;
                String subStr = s.substring(left, right);
                boolean isPalindrome = isPalindrome(subStr);
                if(isPalindrome){
                    return subStr;
                }
            }
        }
        return null;
    }

    private static boolean isPalindrome(String subStr) {
        int len = subStr.length();
        for(int i = 0; i < len / 2; i++){
            if(subStr.charAt(i) != subStr.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }
}
