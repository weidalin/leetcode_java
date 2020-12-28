package leetcode.labuladong.backtrack.bt46_permute;

import java.util.LinkedList;
import java.util.List;

/*
46. 全排列
给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class permute_1 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track, res);
        return res;
    }
    private static void backtrack(int[] nums, LinkedList<Integer> track, List<List<Integer>> res) {
        if(track.size() == nums.length){
            res.add(new LinkedList<>(track));
//            System.out.print(track);
            res.add((track));
//            System.out.println(res);
            return;
        }
        for(int i = 0; i < nums.length; i++){
            //排除
            if (track.contains(nums[i]))
                continue;
            //选择
            track.add(nums[i]);
            backtrack(nums, track, res);
            //取消选择
            track.removeLast();
        }
    }
}/**
 执行用时：
 2 ms
 , 在所有 Java 提交中击败了
 61.76%
 的用户
 内存消耗：
 38.8 MB
 , 在所有 Java 提交中击败了
 51.09%
 的用户*/
