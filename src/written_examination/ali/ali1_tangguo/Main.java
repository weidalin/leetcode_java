package written_examination.ali.ali1_tangguo;

import java.util.Scanner;

import static tools.Weida_utils.print_arr;

/**
 * 分糖果， 输入n，k, 分别表示n个糖果围成一个圈， 你可以从中连续取k个糖果，
 * 求从哪个小标开始取，可以获得最大的糖果数
 * NOTE:如果有两个不同的下标可以获得相同数量的糖果，那就取下标较小的那个。
 */
public class Main {
    static int res = Integer.MIN_VALUE;
    static int res_index = -1;
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        sub_value(nums, 0, n, k);
        sub_value(nums, n-k, n-k-1, k);
        System.out.println(res_index+" "+res);

    }

    private static void sub_value(int[] nums, int left, int right, int k) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int begin = (left + i) % n;
            int end = (left + i + k -1) %n;
            int tmp = count(nums, begin, end);
            if(tmp > res){
                res = tmp;
                res_index = begin;
            }
        }
    }

    private static int count(int[] nums, int begin, int end) {
        int res_tmp = 0;
        if(begin <= end){
            while(begin <= end){
                res_tmp += nums[begin++];
            }
        }else if(begin >= end){
            while(begin < end + nums.length){
                res_tmp += nums[begin % nums.length];
                begin ++;
            }
        }
        return res_tmp;
    }

//
//    private static int[] sub_value1(int[] nums, int left, int right, int k) {
//        int n = nums.length;
//        int[] sum = new int[n];
//        sum[left] = nums[left];
//        for(int i = 1; i < n; i++){
//            sum[(left + i) % n] = sum[(left + i -1) % n] + nums[(left + i) % n];
//        }
//
//        print_arr(sum);
//        System.out.println();
//        int max_begin = -1;
//        int max_value = -1;
//        for(int i = 0; i < n; i++){
//            int end = (i + k) % n;
//            int begin = i;
//            int value = sum[end] - sum[begin];
//            System.out.println("end: "+ end +" - begin: " + begin +" =" + (sum[end]-sum[begin]));
//            if(value > max_value){
//                if (i < k){
//                    max_begin = i + n - k + 1;
//                }else{
//                    max_begin = i;
//                }
//                max_value = value;
//            }
//        }
//        return new int[]{max_begin, max_value};
//    }

/*

3 2
1 2 3


3 1
2 90 3


     */
}

