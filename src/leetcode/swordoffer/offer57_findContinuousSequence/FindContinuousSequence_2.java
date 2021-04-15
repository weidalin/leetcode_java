package leetcode.swordoffer.offer57_findContinuousSequence;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 57 - II. 和为s的连续正数序列
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 *
 *
 * 示例 1：
 *
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * 示例 2：
 *
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 *
 */
public class FindContinuousSequence_2 {

    public static int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        for(int i = 1; i < target; i++) {
            int sum = i;
            for(int j = i+1 ; i < target / 2 + 1; j ++) {
                sum += j;
                if (target == sum) {
                    //得到答案
                    int[] res_item = new int[j - i + 1];
                    for (int k = 0; k < j - i + 1; k++) {
                        res_item[k] = i + k;
                    }
                    res.add(res_item);

                } else if (sum > target) {
                    break;
                }
            }
        }
        int[][] real_res = res.toArray(new int[res.size()][]);
        return real_res;
    }
    /**
     * 执行用时：
     * 17 ms
     * , 在所有 Java 提交中击败了
     * 5.38%
     * 的用户
     * 内存消耗：
     * 36.3 MB
     * , 在所有 Java 提交中击败了
     * 93.85%
     * 的用户
     */
}
