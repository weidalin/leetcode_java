package written_examination.autumn.autumn17_wangyi.wangyi01_;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class Main {
    public int canBePalindromicString (String str1) {
        // write code here
        int[][] dp  = new int[str1.length() + 1][str1.length() + 1];
        for(int i = 0; i < str1.length() - 1; i++){
            if(str1.charAt(i) != str1.charAt(i + 1)){
                dp[i][i+1] = 1;
            }
        }
        for(int i = 2; i < str1.length(); i++){
            for(int j = 0; j < str1.length(); j++){
                int end = j+i;
                if(end >= str1.length())    break;
                if(str1.charAt(j) == str1.charAt(end)){
                    dp[j][end] = dp[j+1][end-1];
                }else{
                    dp[j][end] = Math.min(dp[j+1][end], dp[j][end-1] + 1);
                }
            }
        }
        return dp[0][str1.length() -1] <= 2 ? 1 : 0;
    }
}
