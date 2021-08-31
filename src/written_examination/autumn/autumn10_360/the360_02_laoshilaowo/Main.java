package written_examination.autumn.autumn10_360.the360_02_laoshilaowo;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/29 5:10 下午
 */
// ？
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        long[] nums = new long[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextLong();
        }
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min = Math.min(min, nums[i]);
        }
        if(m == 0){
            System.out.println(min);
            return ;
        }
        long l = min, r = min + m * k;
        while(l < r){
            long mid = l + (r - l + 1) / 2;
            if(check(nums, mid, m, x, k))
                l = mid;
            else
                r = mid - 1;
        }
        System.out.println(l);
//        System.out.println(6);

    }

    private static boolean check(long[] nums, long target, int m, int x, int k) {
        long[] diff = new long[nums.length];
        diff[0] = nums[0];
        for(int i=1; i<nums.length;i++)
            diff[i] = nums[i] - nums[i-1];
        long cur = 0;
        for(int i = 0; i < nums.length; i++){
            cur += diff[i];
            if(cur < target){
                long use= (target - cur + k -1)/k;
                m -= use;
                if(m < 0)   return false;
                cur+=use*k;
                if(i+2*x+1< nums.length)
                    diff[i+2*x+1] -= use*k;
            }
        }
        return m>=0;
    }

}
