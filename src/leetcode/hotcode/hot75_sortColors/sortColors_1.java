package leetcode.hotcode.hot75_sortColors;

import static tools.Weida_utils.print_arr;
import static tools.Weida_utils.swap;

/**
 * 75. 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 示例 1：
 *
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 示例 2：
 *
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：[0]
 * 示例 4：
 *
 * 输入：nums = [1]
 * 输出：[1]
 */
public class sortColors_1 {
    public static void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

    }

    private static void quickSort(int[] nums, int low, int hight) {
        int pivot = nums[low];
        int i = low, j = hight;
        while(i < j){
            while(nums[j] >= pivot && i < j){
                j--;
            }
            while(nums[i] >= pivot && i < j){
                i++;
            }
            swap(nums, i, j);
        }
        nums[low] = nums[i];
        nums[i] = pivot;
        quickSort(nums, low, i - 1);
        quickSort(nums, i + 1, hight);
    }
}
