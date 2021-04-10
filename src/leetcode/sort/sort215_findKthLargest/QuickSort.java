package leetcode.sort.sort215_findKthLargest;

import java.util.Arrays;

public class QuickSort {
    /**
     * 我们可以把快速排序看着三个步骤：
     * 1.选择基准值：在待排序列中，按照某种方式挑出一个元素，作为基准值。
     * 2.分割操作：以该基准值在序列中的实际位置，把序列分成两个子序列，一边是比它大的值，另外一边是比它小的值。
     * 3.递归：对两个子序列进行快排，直到序列为空或者只有一个元素。
     */
    public static void main(String[] args){
        int[] arr = new int[] {9,4,6,8,3,10,4,6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        int p, i, j, temp;
        if (low >= high)    return;
        p = arr[low]; //基准
        i = low;
        j = high;
        while(i < j){
            //.快排中为什么一定是右边先开始循环？https://zhuanlan.zhihu.com/p/64659156可以发现如果左边先走的话将导致分组不成功，即左边的元素并不是都小于基准值。
            //从右边开始找一个比p小的值
            while(arr[j] >= p && i < j){
                j--;
            }
            //从左边开始找一个比p大的值
            while(arr[i] <= p && i < j){
                i++;
            }
            //交换i j
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[low] = arr[i];
        arr[i] = p;
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }
}
/**
 * 时间复杂度	O(NlogN)
 *
 */
