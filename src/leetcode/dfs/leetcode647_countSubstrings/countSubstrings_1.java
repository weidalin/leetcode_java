package leetcode.dfs.leetcode647_countSubstrings;

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
public class countSubstrings_1 {
    public static int countSubstrings(String s) {
       //2.dp
        //dp[i][j] 表示s在[i,j]区间的子串是否为一个回文串
        //if  s[i] == s[j] && (i-j < 2 || dp[i+1][j-1] == true)
        //      dp[i][j] = true
        //else
        //      dp[i][j] = false
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res = 0;
        for(int i = 0 ; i < s.length(); i++){
            for(int j = 0; j <= i; j++){
                if(s.charAt(i) == s.charAt(j) && (i-j < 2 || dp[j+1][i-1] == true)){
                    dp[j][i] = true;
                    res ++;
                }
            }
        }
//        for (int j = 0; j < s.length(); j++) {
//            for (int i = 0; i <= j; i++) {
//                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
//                    dp[i][j] = true;
//                    ans++;
//                }
//            }
        return res;
    }
}
