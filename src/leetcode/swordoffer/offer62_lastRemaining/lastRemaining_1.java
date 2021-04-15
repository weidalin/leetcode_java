package leetcode.swordoffer.offer62_lastRemaining;

import java.util.ArrayList;
import java.util.List;

/**
 *  剑指 Offer 62. 圆圈中最后剩下的数字
 *         0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 *
 *         例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
 *
 *
 *         示例 1：
 *
 *         输入: n = 5, m = 3
 *         输出: 3
 *         示例 2：
 *
 *         输入: n = 10, m = 17
 *         输出: 2
 */
public class lastRemaining_1 {
    public static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int begin_index = 0;
        while(list.size() > 1){
            System.out.println(list);
            begin_index = (begin_index + m - 1) % list.size();
            list.remove(begin_index);
        }
        return list.get(0);
    }
}
/**
 * 执行用时：
 * 1118 ms
 * , 在所有 Java 提交中击败了
 * 5.37%
 * 的用户
 * 内存消耗：
 * 40.6 MB
 * , 在所有 Java 提交中击败了
 * 11.58%
 * 的用户
 */
