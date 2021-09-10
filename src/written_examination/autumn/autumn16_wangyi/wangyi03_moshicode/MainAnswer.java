package written_examination.autumn.autumn16_wangyi.wangyi03_moshicode;

/**
 * @author linweida
 * 2021/9/10 9:48 上午
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 已知摩尔斯电码和字符映射关系如下：
 * A -> 0
 * B -> 1
 * C -> 10
 * D -> 11
 * E -> 100
 * F -> 101
 * G -> 110
 * H -> 111
 * 当前我们获取到了一串01数字字符串，需要进行摩尔斯电码解码，请问共有多少种解码方法？
 *
 * 输入描述:
 * 一行由0和1组成的字符串
 *
 * 输出描述:
 * 一行一个数字表示答案，即解码方法数量
 *
 * 输入例子1:
 * 11
 *
 * 输出例子1:
 * 2
 *
 * 例子说明1:
 * 有D和BB两种解法
 *
 * 输入例子2:
 * 100
 *
 * 输出例子2:
 * 3
 *
 * 例子说明2:
 * 有E,BAA和CA三种解法
 */
public class MainAnswer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int n = str.length;
        int[] dp = new int[n + 1];
        dp[n] = 1;         // 最后一个字符肯定只能是一种翻译
        // 从后往前遍历字符
        // dp[i] = dp[i+1] + dp[i+2] + dp[i+3]
        // dp[i] = dp[i+1] + dp[i+2]
        // dp[i] = dp[i+1]
        for(int i = n - 1; i >= 0; i--){
            dp[i] = dp[i + 1];     // 单字符码的情况
            if(str[i] == '1'){      // 对于"1"，还有双字符码和三字符码的情况
                if(i + 2 <= n) dp[i] += dp[i + 2];
                if(i + 3 <= n) dp[i] += dp[i + 3];
            }
        }
        System.out.println(dp[0]);
    }
}
