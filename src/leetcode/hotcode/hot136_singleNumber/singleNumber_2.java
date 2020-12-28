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
public class singleNumber_2 {
    /**
     *hashset
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        Set set = new HashSet();
        for (int num: nums){
            if (set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        //第一种方法
//        if(!set.isEmpty()){
//            System.out.println(set.iterator().next());// 1.2
//        }
        //第二种方法:将set集合转换成list集合 取第一个
//        List list = new ArrayList(set);
//        System.out.println(list.get(0));// 1.2
        return (int) set.iterator().next();

    }
}
/**
 * 执行用时：
 * 16 ms
 * , 在所有 Java 提交中击败了
 * 11.55%
 * 的用户
 * 内存消耗：
 * 39 MB
 * , 在所有 Java 提交中击败了
 * 25.17%
 * 的用户
 */
