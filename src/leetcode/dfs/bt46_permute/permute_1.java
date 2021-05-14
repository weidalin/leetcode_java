package leetcode.dfs.bt46_permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static tools.Weida_utils.swap;

/*
46. 全排列
给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class permute_1 {
    static List<List<Integer>> res;
    static LinkedList<Integer> tmp;
    public static List<List<Integer>> permute(int[] nums) {
        res = new LinkedList<>();
        tmp = new LinkedList<>();
        dfs(nums);
        return res;
    }

    private static void dfs(int[] nums) {
        if(tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int num : nums){
            if(tmp.contains(num)){
                continue;
            }
            tmp.add(num);
            dfs(nums);
            tmp.removeLast();
        }
    }
    

}
/**
 执行用时：
 9 ms
 , 在所有 Java 提交中击败了
 5.47%
 的用户
 内存消耗：
 38.8 MB
 , 在所有 Java 提交中击败了
 42.97%
 的用户
 */
