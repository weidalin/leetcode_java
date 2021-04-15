package leetcode.hotcode.hot169_majorityElement;

/*

给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。



示例 1：

输入：[3,2,3]
输出：3
 */
public class majorityElement_1 {
    /**
     * 投票
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int count = 0, result = -1;
        for (int num: nums){
            if (count == 0)
                result = num;
            count += (num==result) ? 1: -1;

            System.out.print(num+" "+ count+"\n");
        }
        return result;
    }
}
/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 99.96%
 * 的用户
 * 内存消耗：
 * 41.6 MB
 * , 在所有 Java 提交中击败了
 * 78.84%
 * 的用户
 */