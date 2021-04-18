package leetcode.swordoffer.offer11_minArray;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * 示例 1：
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 */
public class MinArray {
    public static int minArray(int[] numbers) {
        //[2,2,2,0,1]
        int i = 0, j = numbers.length - 1;
        while(i < j) {
            int mid = (i + j) / 2;
                if  (numbers[j] > numbers[mid]) {//说明右边是有序的，此时应该去左边找
                    j = mid;
                } else if(numbers[j] < numbers[mid]) {
                    i = mid + 1;
//            if(numbers[mid] < numbers[j]){//说明右边是有序的，此时应该去左边找
//                j = mid;
//            }else if (numbers[mid] > numbers[j]){
//                i = mid + 1;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}
