package leetcode.hotcode.hot136_singleNumber;

import java.util.HashSet;
import java.util.Set;

/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:

输入: [2,2,1]
输出: 1
示例 2:

输入: [4,1,2,1,2]
输出: 4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/single-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class singleNumber_1 {
    /**
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
/**'
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 99.92%
 * 的用户
 * 内存消耗：
 * 38.6 MB
 * , 在所有 Java 提交中击败了
 * 67.23%
 * 的用户
 */

