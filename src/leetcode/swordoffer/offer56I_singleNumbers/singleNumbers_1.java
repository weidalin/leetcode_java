package leetcode.swordoffer.offer56I_singleNumbers;

/**
 * 剑指 Offer 56 - I. 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [4,1,4,6]
 * 输出：[1,6] 或 [6,1]
 * 示例 2：
 *
 * 输入：nums = [1,2,10,4,1,4,3,3]
 * 输出：[2,10] 或 [10,2]
 */
public class singleNumbers_1 {
    public static int[] singleNumbers(int[] nums) {
        int k = 0;
        //把所有数都做异或操作，最终会得到两个不同的数的异或值
        for(int num : nums){
            k ^= num;
        }
        //想办法将两个数从k中分成两组， mask
        int mask = 1;
        while((k & mask) == 0){
            mask  = mask<< 1;
        }
        int a = 0, b = 0;
        for(int num : nums){
            if((num & mask) == 0){ //注意一定是要 == 0， 而不是1
                a = a ^ num;
            }else{
                b = b ^ num;
            }
        }
        return new int[]{a, b};
    }
}
