package leetcode.swordoffer.offer40_getLeastNumbers;

import static tools.Weida_utils.print_arr;
import static tools.Weida_utils.swap;

/**
 * 剑指 Offer 40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 */
public class getLeastNumbers_2 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        // 冒泡排序
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            for(int  j = arr.length - 1; j > i; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
            }
            res[i] = arr[i];
        }
        print_arr(res);
        return res;
        /**
         * 执行用时：
         * 839 ms
         * , 在所有 Java 提交中击败了
         * 5.01%
         * 的用户
         * 内存消耗：
         * 39.9 MB
         * , 在所有 Java 提交中击败了
         * 33.15%
         * 的用户
         */

        //插入排序


    }
}
