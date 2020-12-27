package src.leetcode.backtrack;

import sun.font.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

/**
 * result = []
 * def backtrack(路径, 选择列表):
 *     if 满足结束条件:
 *         result.add(路径)
 *         return
 *
 *     for 选择 in 选择列表:
 *         做选择
 *         backtrack(路径, 选择列表)
 *         撤销选择
 *
 * 作者：labuladong
 * 链接：https://leetcode-cn.com/problems/n-queens/solution/hui-su-suan-fa-xiang-jie-by-labuladong/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class backTrackTemple {
    //sort and combination
    public void  backtrackV1(List<ArrayList<Integer>> list, List<Integer> tmp_list, int[] nums){
        if (tmp_list.size() == nums.length)
            list.add(new ArrayList<Integer>(tmp_list));
        else{
            for (int i=0; i<nums.length; i++){
                if (tmp_list.contains(nums[i]))
                    continue;
                tmp_list.add(nums[i]);
                backtrackV1(list, tmp_list, nums);
                tmp_list.remove(nums[i]);
            }
        }
    }

    public void backtrackV2(List<List<Integer>> results, List<Integer> result, int[] nums, int start){
        //accept
        if (true)
            results.add(new ArrayList<>(result));
        //crop
        if(false)
            return;
        for (int i=start; i<nums.length; i++){
            //1.choose
            result.add(nums[i]);
            //2.explore
            backtrackV2(results, result, nums,i+1);
            //3.unchoose
            result.remove(result.size()-1);

        }
    }
}
