package written_examination.autumn.autumn15_shunfeng_ok.shunfeng02_lvyou;

import java.util.*;

/**
 * @author linweida
 * 2021/9/6 8:45 下午
 */

public class Main {
    static int res = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        dfs(nums, 0, 0, 0);
        System.out.println(res);
    }

    private static void dfs(int[] nums, int i, int curHappy, int curGoods) {
        if(curHappy < 0 || i == nums.length){
            res = Math.max(res, curGoods);
            return;
        }
        // 买和不买
        dfs(nums, i + 1, curHappy + nums[i], curGoods + 1);
        dfs(nums, i + 1, curHappy , curGoods);
    }
}
/*

6
4 -4 1 -3 1 -3


 */
