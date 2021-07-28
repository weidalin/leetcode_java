package leetcode.hotcode.hot15_threeSum;

import java.util.ArrayList;
import java.util.List;

import static leetcode.labuladong.binarytree.binarytree538_convertBST.convertBST_1.sum;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 *
 * 输入：nums = []
 * 输出：[]
 */
public class threeSum_3 {
    static List<List<Integer>> res;
    public static List<List<Integer>> threeSum(int[] nums) {
        res = new ArrayList<>();
        List<Integer> nums_list = new ArrayList<>();
        for(int num : nums){
            nums_list.add(num);
        }
        dfs(nums, 0, nums_list, sum, new ArrayList<Integer>());
        return res;
    }

    private static void dfs(int[] nums, int i, List<Integer> nums_list, int sum, ArrayList<Integer> tmp) {
        if(i == 3 && sum == 0 && !res.containsAll(tmp)){
            res.add(new ArrayList<>(tmp));
        }else if(i >= 3){
            return;
        }else{
            for(int j = 0; j < nums_list.size(); j++){
                int num = nums_list.get(j);
                nums_list.remove(j);
                tmp.add(num);
                dfs(nums, i + 1, nums_list, sum + num, tmp);
                tmp.remove(tmp.size()-1);
                nums_list.add(j,num);
            }
        }

    }
}
