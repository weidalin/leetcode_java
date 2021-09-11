package written_examination.autumn.autumn17_wangyi.wangyi04_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 从两个升序数组中，找到第k小的数
     *
     * @param arr1 int整型一维数组 整数数组，长度为[1, 10^9]
     * @param arr2 int整型一维数组 第二个数组，长度为[1, 10^9]
     * @param k    int整型 要输出的数所在的位置，取值范围为 [1, 两个数组的长度之和]
     * @return int整型
     */
    public int find_kth(int[] arr1, int[] arr2, int k) {
        // write code here
        int i = 0, j = 0;
        int cur = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                i++;
                cur++;
                if(cur == k){
                    return arr1[i];
                }
            }else{
                j++;
                cur++;
                if(cur == k){
                    return arr2[j];
                }
            }
        }
        if(i == arr1.length){
            while(j < arr2.length){
                j++;
                cur++;
                if(cur == k){
                    return arr2[j];
                }
            }
        }else{
            while(i < arr1.length){
                i++;
                cur++;
                if(cur == k){
                    return arr1[i];
                }
            }
        }
        return -1;
    }
}