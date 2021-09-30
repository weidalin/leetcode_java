package written_examination.autumn.autumn35_baidu.baidu02;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/28 8:02 下午
 */

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0; tt < t; tt++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                int input = sc.nextInt();
                nums[i] = input % 2;
            }
            BigDecimal res = func(nums, k);
            System.out.println(res);
        }
    }

    private static BigDecimal func(int[] nums, int k) {
        int jishu  = 0;
        int oushu  = 0;
        for(int num : nums){
            if(num %2 == 0){
                oushu ++;
            }else{
                jishu++;
            }
        }
        if(k % 2 == 0){
            return combinations(jishu, k).add(combinations(oushu, k));
        }else{
            return combinations(oushu, k);
        }
    }

    private static BigDecimal combinations(int n, int k) {
        BigDecimal ans = new BigDecimal(1);
        for(int i = 1; i <= k; i++){
            ans = ans.multiply(new BigDecimal(n - k + i)).divide(new BigDecimal(i));
        }
        return ans;

    }

    // C(n,k)
//    private static int combinations(int n, int k) {
//        if(k == 0 || k == n){
//            return 1;
//        }else {
//            return combinations(n-1, k) + combinations(n-1, k-1);
//        }
//    }


}
/*

3
5 2
1 2 3 4 5
3 1
1 2 3
4 3
1 4 2 2

1
5 2
1 2 3 4 5
 */