package leetcode.dfs.leetcode39_combinationSum;

import java.util.*;

/**
 * 39. 组合总和
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1：
 *
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2：
 *
 * 输入：candidates = [2,3,5], target = 8,
 * 所求解集为：
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class combinationSum_1 {
    static List<List<Integer>> res;
    static LinkedList<Integer> tmp ;
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        tmp = new LinkedList<>();
        dfs(candidates, target,0,0);
        return res;
    }

    private static void dfs(int[] candidates, int target, int cur_sum, int idx) {
        //1.end
        if(cur_sum == target) {
            res.add(new ArrayList<>(tmp));
            return;
        }
       else if (cur_sum > target){
            return;
        }
        //2.choose
        for(int i = idx; i < candidates.length; i++){
            cur_sum += candidates[i];
            tmp.add(candidates[i]);
            dfs(candidates, target, cur_sum, i);
            //3.撤销
            cur_sum -= candidates[i];
            tmp.removeLast();
        }
    }
    /**
     * List<List<Integer>> res;
     *     LinkedList<Integer> tmp;
     *     public List<List<Integer>> combinationSum(int[] candidates, int target) {
     *         res = new ArrayList<>();
     *         tmp = new LinkedList<>();
     *         dfs(candidates, target, 0);
     *         return res;
     *     }
     *     public void dfs(int[] candidates, int target, int idx){
     *         //1.end
     *         if(target == 0){
     *             res.add(new ArrayList<>(tmp));
     *             return;
     *         }if(target < 0){
     *             return;
     *         }
     *         //2.choose
     *         for(int i = idx; i < candidates.length; i++){
     *             tmp.add(candidates[i]);
     *             dfs(candidates, target - candidates[i], i);
     *             // 3. back
     *             tmp.removeLast();
     *         }
     *     }
     */
}
/**
 * 执行结果：
 * 通过
 * 显示详情
 * 执行用时：
 * 5 ms
 * , 在所有 Java 提交中击败了
 * 31.51%
 * 的用户
 * 内存消耗：
 * 39 MB
 * , 在所有 Java 提交中击败了
 * 15.72%
 * 的用户
 */
