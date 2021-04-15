package leetcode.swordoffer.offer57_findContinuousSequence;

import java.util.ArrayList;
import java.util.List;

import static tools.Weida_utils.print_arr;

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
public class FindContinuousSequence_1 {

    public static int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 1, j = 1, sum = 0;
        while(i <= target / 2){//右区间右移动
            if(sum < target){
                sum += j;
                j++;
            }else if(sum > target){//左区间右移动
                sum -= i;
                i ++;
            }else{
                int[] res_item = new int[j - i];
                for(int k = i; k < j; k++){
                    res_item[k-i] = k;
                }
                res.add(res_item);
//                print_arr(res_item);
//                System.out.println();
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    /**
     *执行用时：
     * 4 ms
     * , 在所有 Java 提交中击败了
     * 56.61%
     * 的用户
     * 内存消耗：
     * 36.8 MB
     * , 在所有 Java 提交中击败了
     * 15.62%
     * 的用户
     */
}
