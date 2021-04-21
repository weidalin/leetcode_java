package written_examination.weipinhui;

import java.util.Random;

/**
 * 215. 数组中的第K个最大元素
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 *
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */
public class FindKthLargest_2 {

    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        // 第 k 大元素的索引是 len - k
        int target = len - k;
        while (true) {
            int index = partition(nums, left, right);
            if (index == target) {
                return nums[index];
            } else if (index < target) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }
    }
    public int partition(int[] nums, int left, int right) {
        int pivot = nums[left]; //第一个数作为pivot
        int j = left;//j记录当前发生交换的位置
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < pivot) {
                j++;// 小于 pivot 的元素都被交换到前面，即当前i和当前交换位置j
                swap(nums, j, i);
            }
        }
        swap(nums, j, left);//交换一下num[j]和pivot,使得nums[j] = pivot,即j位置为切分位置
        return j;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
