package written_examination.autumn.autumn33_wuba.wuba_01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linweida
 * 2021/9/25 7:43 下午
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2};
        int total = 3;
        int a = weight(nums, total);
        System.out.println(a);
    }

    static int res;
    static int total;
    static int[] weights;
    public static int weight(int[] weight, int tot) {
        // write code here
        res = Integer.MAX_VALUE;
        weights = weight;
        total = tot;
        dfs(0, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static void dfs(int cur_sum, int cur_num) {
        System.out.println(cur_sum + "=" + cur_num);
        if(cur_sum == total){
            res = Math.min(res, cur_num);
            return;
        }
        if(cur_sum > total){
            return;
        }

        for(int weight : weights){
            dfs(cur_sum + weight, cur_num + 1);
        }
    }
}
