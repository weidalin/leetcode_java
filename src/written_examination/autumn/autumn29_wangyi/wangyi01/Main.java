package written_examination.autumn.autumn29_wangyi.wangyi01;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/18 7:14 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = numDevide(n);
        System.out.println(res);
    }

    private static int numDevide(int n) {
        int res = 0;
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++){
            int curNum = str.charAt(i) - '0';
            if(curNum == 0) continue;
            if(n % curNum == 0){
                res++;
            }
        }
        return res;
    }
}
/*
7300
0
 */
