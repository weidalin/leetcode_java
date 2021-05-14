package leetcode.dfs.bt46_permute;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static tools.Weida_utils.swap;

/*
46. 全排列
给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class permute_3 {
    static List<List<Integer>> res;
    static LinkedList<Integer> tmp;
    public static List<List<Integer>> permute(int[] nums) {
        res = new LinkedList<>();
        tmp = new LinkedList<>();
        dfs(0, nums);
        return res;
    }

    private static void dfs(int idx, int[] nums) {
        if(idx == nums.length - 1){
            Integer[] newObj2 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
            res.add(Arrays.asList(newObj2));
        }

        for(int i = idx; i < nums.length; i++){
            swap(nums, idx , i);
            dfs(idx + 1, nums);
            swap(nums, idx, i);
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
