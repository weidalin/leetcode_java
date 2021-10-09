package written_examination.autumn.autumn36_ali.ali02;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/10/8 8:30 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int x ,y;
        Integer.toBinaryString(10);
        for(int i = 0; i < t; i++){
            String[] str = sc.nextLine().split(" ");
            String str1 = str[0];
            String str2 = str[1];
            if(str1.charAt(0) == '0'){
                x = Integer.valueOf(str1, 2);
            } else {
                x = ~(Integer.valueOf(str1.substring(1), 2) );
            }

            if(str2.charAt(0) == '0'){
                y = Integer.valueOf(str2, 2);
            } else {
                String tmp = qufan(str2.substring(1));
                y = Integer.valueOf(tmp, 2) - 1;
            }

            System.out.print(x + "   ");
            System.out.print(y + "   ");
            System.out.println(x + y);
        }
    }

    private static String qufan(String str) {
        StringBuffer sb = new StringBuffer();
        for(char ch : str.toCharArray()){
            if(ch == '0'){
                sb.append("1");
            }else{
                sb.append(0);
            }
        }
        return sb.toString();
    }
}
/*
2
00000000000000000000000000000101 11111111111111111111111111111111
00000000000000000000000000011111 00000000000000000000000000000111

 */
