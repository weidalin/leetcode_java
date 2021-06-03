package leetcode.hotcode.hot312_maxCoins;

import java.util.ArrayList;
import java.util.List;

/**
 * 312. 戳气球
 * 有 n 个气球，编号为0 到 n - 1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
 *
 * 现在要求你戳破所有的气球。戳破第 i 个气球，你可以获得 nums[i - 1] * nums[i] * nums[i + 1] 枚硬币。 这里的 i - 1 和 i + 1 代表和 i 相邻的两个气球的序号。如果 i - 1或 i + 1 超出了数组的边界，那么就当它是一个数字为 1 的气球。
 *
 * 求所能获得硬币的最大数量。
 *
 * 示例 1：
 * 输入：nums = [3,1,5,8]
 * 输出：167
 * 解释：
 * nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
 * coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167
 * 示例 2：
 *
 * 输入：nums = [1,5]
 * 输出：10
 */
public class maxCoins_2 {
    static int res;
    public static int maxCoins(int[] nums) {
        res = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int num :nums){
            list.add(num);
        }
        list.add(1);
        dfs(list, 0);
        return res;
    }

    private static void dfs(List<Integer> list, int tmp) {
        if(list.size() == 2){
            res = Math.max(res, tmp);
            return;
        }
        for(int i = 1; i < list.size()-1; i++){
            int add = list.get(i-1) * list.get(i) * list.get(i+1);
            tmp += add;
            Integer remove_num = list.remove(i);
            dfs(list, tmp);
            tmp -= add;
            list.add(i, remove_num);
        }
    }
}
/**
 * 超时啦
 */
