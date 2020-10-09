package leetcode.medium;

import static tools.Weida_utils.print_arr;

/**
 * 75. 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 *
 * 示例:
 *
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 */
public class medium_75 {

    //partition
    public static void sortColors_v2(int[] nums) {
        int len = nums.length;
        if (len<2)
            return;
        int zeros = -1;
        int two = len-1;
        int i = 0;
        while(i <= two){
            if (nums[i] == 0){
                zeros++;
                swap(nums, i, zeros);;
                i++;
            }else if(nums[i] == 1){
                i++;
            }else{
                swap(nums, i , two);
                two--;
            }
        }
    }


    //bubble sort
    /**
     * 执行用时：
     * 2 ms
     * , 在所有 Java 提交中击败了
     * 10.55%
     * 的用户
     * 内存消耗：
     * 37.4 MB
     * , 在所有 Java 提交中击败了
     * 37.70%
     * 的用户
     * @param nums
     */
    public static void sortColors(int[] nums) {
        for (int i=0; i<nums.length-1;i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[j]<nums[i]){
                        swap(nums,i,j);
                }
            }
        }

    }
    private static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i]+nums[j];
        nums[j] = nums[i]-nums[j];
        nums[i] = nums[i]-nums[j];
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0,0,0,};
        sortColors_v2(nums);
        print_arr(nums);

    }
}
