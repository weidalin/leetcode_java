package src.leetcode.hotcode.hot1_twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * 2.哈希表
 * 注意到方法一的时间复杂度较高的原因是寻找 target - x 的时间复杂度过高。因此，我们需要一种更优秀的方法，能够快速寻找数组中是否存在目标元素。如果存在，我们需要找出它的索引。
 *
 * 使用哈希表，可以将寻找 target - x 的时间复杂度降低到从 O(N)O(N) 降低到 O(1)O(1)。
 *
 * 这样我们创建一个哈希表，对于每一个 x，我们首先查询哈希表中是否存在 target - x，然后将 x 插入到哈希表中，即可保证不会让 x 和自己匹配。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 *
 *
 *
 */
public class TwoSum2 {
    public static int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length;i++){
            if (hashtable.containsKey(target - nums[i])){
                return new int[]{hashtable.get(target-nums[i]), i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}
/**
 * 时间复杂度：O(N)，其中 N 是数组中的元素数量。对于每一个元素 x，我们可以 O(1)O(1) 地寻找 target - x。
 *
 * 空间复杂度：O(N)，其中 N 是数组中的元素数量。主要为哈希表的开销。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
