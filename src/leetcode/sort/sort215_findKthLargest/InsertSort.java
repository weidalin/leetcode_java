package leetcode.sort.sort215_findKthLargest;

import java.util.Arrays;

import static tools.Weida_utils.swap;

public class InsertSort {
    /**
     * 在数组已经较为有序，或仅有几个元素的位置有错误的情况下，使用插入排序的效率非常高。因为在插入排序中，如果一个元素已经处于排好序的位置，那么这个元素可以不做任何交换。而在选择排序中，每一趟排序的结果和原数组的位置无关，无论是否排好序，选择排序都要进行同样的操作，这样就带来了不必要的时间浪费。
     * ————————————————
     * 版权声明：本文为CSDN博主「QuinnNorris」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/QuinnNorris/article/details/70885771
     * @param args
     */
    public static void main(String[] args){
        int[] arr = new int[] {9,4,6,8,3,10,4,6};
        insertSort(arr);
        System.out.println("insertSort："+ Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }

    }

}
