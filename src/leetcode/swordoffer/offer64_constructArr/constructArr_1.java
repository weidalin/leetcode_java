package leetcode.swordoffer.offer64_constructArr;

/**
 * 剑指 Offer 66. 构建乘积数组
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 *
 *
 * 示例:
 *
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 */
public class constructArr_1 {
    public static int[] constructArr(int[] a) {
        int n = a.length;
        if (n == 0){
            return new int[0];
        }
        int[] res = new int[n];
        res[0] = 1;
        int tmp = 1;
        for(int i = 1; i < n; i++){
            res[i] = res[i-1] * a[i-1];
        }
        for(int j = n - 2; j >= 0; j--){
            tmp *= a[j + 1];
            res[j] *= tmp;
        }
        return res;
    }
}
/**
 * time O(N)
 * space O(1)
 */
