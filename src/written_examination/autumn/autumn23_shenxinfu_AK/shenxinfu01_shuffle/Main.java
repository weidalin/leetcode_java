package written_examination.autumn.autumn23_shenxinfu_AK.shenxinfu01_shuffle;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/9/14 7:53 下午
 */
// ac
public class Main {
    public static int[] shuffle (int[] arr, int i) {
        // write code here
        int n = arr.length;
        int[] res = new int[n];
        int left = 0, right = i;
        int idx = 0;
        while(left < i && right < n){
            res[idx++] = arr[left++];
            res[idx++] = arr[right++];
        }
        if(left == i){
            while( right < n){
                res[idx++] = arr[right++];
            }
        }
        if(right == n){
            while( left < i){
                res[idx++] = arr[left++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7};
        int[] res = shuffle(nums, 2);
        print_arr(res);
    }
}
/*

[4,5,6,7],2
 */
