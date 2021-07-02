package leetcode.dp.hot5_longestPalindrome;

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
public class longestPalindrome_1 {
    /**
     * 暴力
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String origin = s;
        String reverse = new StringBuffer(s).reverse().toString();
        int length = s.length();
        int[][] arr = new int[length][length];
        int maxLen = 0;
        int maxEnd = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(origin.charAt(i) == reverse.charAt(j)){
                    if(i == 0 || j == 0){
                        arr[i][j] = 1;
                    }else{
                        arr[i][j] = arr[i-1][j-1] + 1;
                    }
                }
                /*
                if (arr[i][j] > maxLen) {
                    maxLen = arr[i][j];
                    maxEnd = i; //以 i 位置结尾的字符
                }
                 */
                if(arr[i][j] > maxLen){
                    int beforeRev = length - j - 1;
                    if(beforeRev + arr[i][j] - 1 == i){
                        // 判断下标是否对应
                        maxLen = arr[i][j];
                        maxEnd = i;
                    }
                }
            }
        }
        return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
    }
}
