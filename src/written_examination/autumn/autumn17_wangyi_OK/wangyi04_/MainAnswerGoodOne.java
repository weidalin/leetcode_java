package written_examination.autumn.autumn17_wangyi_OK.wangyi04_;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class MainAnswerGoodOne {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 从两个升序数组中，找到第k小的数
     *
     * @param arr1 int整型一维数组 整数数组，长度为[1, 10^9]
     * @param arr2 int整型一维数组 第二个数组，长度为[1, 10^9]
     * @param k    int整型 要输出的数所在的位置，取值范围为 [1, 两个数组的长度之和]
     * @return int整型
     */
    public int find_kth(int[] arr1, int[] arr2, int k) {
        // write code here
        int m = arr1.length;
        int n = arr2.length;
        if (k == m + n) return Math.max(arr1[m],arr2[n]);
        return find_kth(arr1, arr2, 0, Math.min(m-1, k), 0, Math.min(n-1, k), k);
    }
//    作者：牛客745729381号
//    链接：https://www.nowcoder.com/discuss/739215?channel=-1&source_id=profile_follow_post_nctrack
//    来源：牛客网

    int find_kth(int[] arr1, int[] arr2, int st1,int ed1,int st2,int ed2,int k) {
        int m = ed1 - st1+1;
        int n = ed2 - st2+1;
        if (m <= 0) return arr1[st2 + k - 1];
        if (n <= 0) return arr1[st1 + k - 1];
        if(k==m+n) return Math.max(arr1[m], arr2[n]);
        if (k == 1) return Math.min(arr2[st1],arr2[st2]);
        int mid1 = Math.min(st1 += k / 2 - 1,ed1);
        int mid2 = Math.min(st2 += k / 2 - 1,ed2);
        if (arr1[mid1] < arr2[mid2]) {  // k/2中部。。。。arr1中部 < arr2中部， 收缩arr1
            return find_kth(arr1,arr2,mid1+1,ed1,st2,ed2,k-(mid1+1-st1));
        }
        else return find_kth(arr1, arr2, st1, ed1, mid2+1, ed2, k - (mid2 + 1 - st2));
    }
}