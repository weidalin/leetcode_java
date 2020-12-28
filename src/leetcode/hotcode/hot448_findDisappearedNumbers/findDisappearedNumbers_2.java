package leetcode.hotcode.hot448_findDisappearedNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
448. 找到所有数组中消失的数字
给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

找到所有在 [1, n] 范围之间没有出现在数组中的数字。

您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

示例:

输入:
[4,3,2,7,8,2,3,1]

输出:
[5,6]
 */
public class findDisappearedNumbers_2 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set set = new HashSet();
        for (int i=1; i<=n; i++){
            set.add(i);
        }
        for (int num: nums){
            if (set.contains(num))
                set.remove(num);
        }
        List<Integer> res = new ArrayList<Integer>(set);
        return res;
    }
}
/**
 * 执行用时：
 * 29 ms
 * , 在所有 Java 提交中击败了
 * 5.44%
 * 的用户
 * 内存消耗：
 * 48.4 MB
 * , 在所有 Java 提交中击败了
 * 5.03%
 * 的用户
 * 炫耀一下:
 */
