package leetcode.hotcode.hot31_nextPermutation;

import static tools.Weida_utils.print_arr;
import static tools.Weida_utils.swap;

/**
 * 31. 下一个排列
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 *
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * 示例 3：
 *
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * 示例 4：
 *
 * 输入：nums = [1]
 * 输出：[1]
 */
public class nextPermutation_1 {
    public static void nextPermutation(int[] nums) {
        print_arr(nums);
        System.out.println();
        if(nums.length <= 1){
            return;
        }
        int len = nums.length;
        // 1. 找到最后一个升序的一对相邻数
        int i = len - 2, j = len - 1, k = len - 1;
        while(i >= 0 && nums[i] >= nums[j]){
            i--;
            j--;
        }
        // 2. 从后开始找，第一个比nums[i]大的数，这个数要尽量小
        // （其实 1. 的操作已经保证了从后往前找,找到的第一个数就是尽量小的那个数）
        if(i >= 0){
            while(nums[i] >= nums[k]){
                k--;
            }
            swap(nums, i, k);
        }
        // 3. 翻转 [j: len]区间的所有数
        for(int m = 0; m < (len - j) / 2; m++){
            swap(nums, j+m, len - m - 1);
        }
        print_arr(nums);
    }
}
