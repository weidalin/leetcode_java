package written_examination.autumn.autumn10_360.the360_01_laoshilaowo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/29 5:10 下午
 */
// 100%
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int a = 100;
        int res = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(i == n - 1){
                int b = nums[n-1];
                int grade = (p * a + q * b) / 100;
                if(grade < 60){
                    System.out.println(res);
                    break;
                } else {
                    res++;
                }
            }else if(i < n - 1 && nums[i] == nums[i+1]){
                res++;
            }else{
                int b = nums[i];
                a--;
                int grade = (p * a + q * b) / 100;
                if(grade < 60){
                    System.out.println(res);
                    break;
                } else {
                    res++;
                }
            }
            if(i==0){
                System.out.println(res);
            }
        }
    }
}
