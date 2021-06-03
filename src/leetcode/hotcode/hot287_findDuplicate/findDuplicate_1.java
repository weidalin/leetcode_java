package leetcode.hotcode.hot287_findDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * 287. 寻找重复数
 * 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 *
 * 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
 *
 * 示例 1：
 *
 * 输入：nums = [1,3,4,2,2]
 * 输出：2
 * 示例 2：
 *
 * 输入：nums = [3,1,3,4,2]
 * 输出：3
 * 示例 3：
 *
 * 输入：nums = [1,1]
 * 输出：1
 * 示例 4：
 *
 * 输入：nums = [1,1,2]
 * 输出：1
 */
public class findDuplicate_1 {
    //快慢指针
    public static int findDuplicate(int[] nums) {
        int i = 0, j = 0;
        while(true){
            if(i >= nums.length){
                i %= nums.length;
            }
            if(j >= nums.length){
                j %= nums.length;
            }

            System.out.println(i + " " + j);

            if( i != j && nums[i] == nums[j]){
                return nums[i];
            }else{
                i+=1;
                j+=2;
            }
        }
    }
}
