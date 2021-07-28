package leetcode.hotcode.hot04_findMedianSortedArrays;

public class findMedianSortedArrays_1 {
    /**
     * 4. 寻找两个正序数组的中位数
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     *
     * 示例 1：
     *
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     * 示例 2：
     *
     * 输入：nums1 = [1,2], nums2 = [3,4]
     * 输出：2.50000
     * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
     * 示例 3：
     *
     * 输入：nums1 = [0,0], nums2 = [0,0]
     * 输出：0.00000
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int start1=0, start2=0;
        int a = -1, b = -1;
        int n = nums1.length, m = nums2.length;
        int len = n + m;
        for(int i = 0; i < len / 2; i++){
            a = b;
            if(start1 < n && start2 >= m || nums1[start1] < nums2[start2]){
                b = nums1[start1++];
            }else{
                b = nums2[start2++];
            }
        }
        if(len % 2 == 0){
            return b;
        }else{
            return (a + b) / 2;
        }
    }
}
