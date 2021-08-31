package written_examination.autumn.autumn08_weizong.weizong01_monthweek1;

import java.util.Arrays;
import java.util.Scanner;

// 100
// 时间区间内每月1号同时是周一的天数
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        int resA = calculte(a-1);
        int resB = calculte(b);

        System.out.println(resB-resA);
    }

    private static int calculte(int b) {
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] curMonth;
        int i = 1900;
        int sum = 0;
        int res = 0;
        while(i <= b){
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                curMonth = Arrays.copyOf(month, 12);
                curMonth[1] = 29;
            }else{
                curMonth = Arrays.copyOf(month, 12);
            }
            for(int mon : curMonth){
                sum += mon;
                if(sum % 7 == 0){
                    res ++;
                }
            }
            i++;
        }
        return res;
    }
}
/*

2021 2021
 */
