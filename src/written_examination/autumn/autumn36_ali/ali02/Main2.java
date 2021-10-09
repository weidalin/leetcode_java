package written_examination.autumn.autumn36_ali.ali02;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/10/8 8:30 下午
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Integer.toBinaryString(10);
        for(int i = 0; i < t; i++){
            String[] str = sc.nextLine().split(" ");
            String str1 = str[0];
            String str2 = str[1];
            int x = 0, y = 0;
            for(int j = Integer.MIN_VALUE; j < Integer.MAX_VALUE; j++){
                String tmp = Integer.toBinaryString(j);
                if(tmp.equals(str1)){
                    x = j;
                }if(tmp.equals(str2)){
                    y = j;
                }
            }
            System.out.println(x + y);
        }
    }
}
/*
2
00000000000000000000000000000101 11111111111111111111111111111111
00000000000000000000000000011111 00000000000000000000000000000111

 */
