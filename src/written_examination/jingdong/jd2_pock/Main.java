package written_examination.jingdong.jd2_pock;
import static tools.Weida_utils.print_arr;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者：折纸折c
 * 链接：https://www.nowcoder.com/discuss/648307?type=all&order=time&pos=&page=1&channel=-1&source_id=search_all_nctrack
 * 来源：牛客网
 *
 * 题目描述：
 * 初始位置0已有卡片0，现在有1~n的卡片，从卡牌中随机抽一张出来加入末尾，求满足下面条件的卡牌序列有多少种
 * 1、最末尾位置为卡片n
 * 2、相邻两位置卡片数字的差值绝对值大小不超过2
 *
 * 输入 3
 * 输出 2
 * 解释： 有2个合法的序列 {0,1,2,3}、{0,2,1,3}
 */
public class Main {
    static int count = 0;
    static int n;
    public static void main(String[] args) {
//        作者：折纸折c
//        链接：https://www.nowcoder.com/discuss/648307?type=all&order=time&pos=&page=1&channel=-1&source_id=search_all_nctrack
//        来源：牛客网
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        int MOD = 998244353;

        for(int i = 4;i < n + 1;i++){
            dp[i] = (dp[i-1] + dp[i-3])%MOD;
        }
        System.out.println(dp[n]);
    }
}
/**
 * 作者：折纸折c
 * 链接：https://www.nowcoder.com/discuss/648307?type=all&order=time&pos=&page=1&channel=-1&source_id=search_all_nctrack
 * 来源：牛客网
 *
 * 简单说下我的思路，以i结尾的序列可以由i-1、i-3计算到
 * i-1非常直观 直接在dp[i-1]的每个序列后 添加一个i就可以
 * 但是这种添加的方法实际上 限定了最后两个位置分别是i-1，i
 *
 * 实际上最后2个位置还可以是 i-2,i
 * 所以在dp[i-3]的所有序列后面固定添加{i-1,i-2,i}的序列也是解
 *
 * 即dp[i] = dp[i-1]+dp[i-3]
 */
