package written_examination.intern.ali.ali2_yutang;

import java.util.Scanner;

/**
 * 题目描述
 *      有 n 个鱼塘按照顺序排成一排，第 1 <= i <= n 个鱼塘有 a[i] 条鱼。
 *      在第 i 个鱼塘每捕捞一条鱼需要消耗 cost[i] 的体力。
 *      一开始体力值为 w，同时也是体力上限（体力值需要大于等于 0）.
 *      每捕捞一条鱼你的体力上限会增加 b，从一个鱼塘走到下一个鱼塘体力恢复 x。
 *      一开始在 1 号鱼塘，必须按照顺序走到 n 号鱼塘，中途不能回头。
 *      问在这个过程中最多可以捕获多少条鱼。
 *
 * 输入描述
 *      第一行四个整数 n，w，b，x （1 <= n <= 200, 1 <= w, b, x <= 10^9）
 *      第二行 n 个整数 a[i] (1 <= a[i] <= 10)
 *      第三行 n 个整数 cost[i] (1 <= cost[i] <= 10^9)
 *
 * 输出描述
 *      输出一行，一个整数表示最多可以捕获的鱼数。
 *
 * 示例
 *      输入
 *      2 12 0 4
 *      3 4
 *      4 2
 *      输出
 *      6
 *      解释
 *      第一个鱼塘捕鱼 2 条，消耗体力为 8，剩余体力为 4.
 *      走到第二个鱼塘体力恢复 4，此时体力还有 8，在第二个鱼塘捕鱼 4 条。
 *      最多可以捕获 6 条鱼。
 *
 * 结果：过 50%
 */
public class Main {
    static int max_res = -1;
    static int[] nums;
    static int[] cost;
    static int b;
    static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextInt();
        nums = new int[n];
        cost = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < cost.length; i++){
            cost[i] = sc.nextInt();
        }
        dfs(w, w, 0, 0);
        System.out.println(max_res);
    }

    private static void dfs(int w_up, int cur_w, int i, int cur_res) {
        //函数出口
//        if(cur_w < 0){
//            return;
//        }
        if(cur_w < 0 || i >= nums.length){
            if(max_res < cur_res){
                max_res = cur_res;
            }
            return ;
        }
        //开始抓鱼
        if(cur_w >= cost[i]){
            int max_nn = Math.min(cur_w / cost[i], nums[i]);//最多可以抓max_nn条
            for(int nn = 0; nn <= max_nn; nn++){//我们选择抓nn条，nn在[0, max_nn]
                //进入下一个鱼塘之前，更新w_up, cur_w, cur_res
                w_up += b * nn;
                int cur_w_backup = cur_w;
                cur_w -= nn * cost[i];
                cur_w = Math.min(cur_w + x, w_up);
                cur_res += nn;
                dfs(w_up, cur_w, i +  1, cur_res);
                //回溯
                w_up -= b * nn;
                cur_w = cur_w_backup;
                cur_res -= nn;
            }
        }else{
            dfs(w_up, cur_w,i + 1, cur_res);
        }
    }
}

/**
 *
 *

2 12 0 4
3 4
4 2


 */
