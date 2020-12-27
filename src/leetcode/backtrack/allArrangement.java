package src.leetcode.backtrack;

import java.util.LinkedList;
import java.util.List;

public class allArrangement {

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track, res);
        return res;
    }

    // 路径：记录在 track 中
    // 选择列表：nums 中不存在于 track 的那些元素
    // 结束条件：nums 中的元素全都在 track 中出现
    private static void backtrack(int[] nums, LinkedList<Integer> track, List<List<Integer>> res) {
        if (track.size() == nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i=0; i<nums.length; i++){
            if(track.contains(nums[i])) continue;
            //choose
            track.add(nums[i]);
            //explore
            backtrack(nums, track, res);
            //remove
            track.remove(track.size()-1);
        }
    }

    public static void main(String[] args){
        int[] nums ={1,2,3};
        List<List<Integer>> res = permute(nums);
        System.out.println(res);
    }
}
