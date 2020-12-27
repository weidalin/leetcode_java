package src.leetcode.hotcode.hot1_twosum;

import static tools.Weida_utils.print_arr;

public class main {
    public  static void main(String[] args) {
        int[] nums = {2, 0, 9, 11, 15};
        int target = 9;
        int[] res = TwoSum2.twoSum_2(nums, target);
        print_arr(res);

    }
}
