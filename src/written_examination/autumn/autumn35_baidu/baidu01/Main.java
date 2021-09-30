package written_examination.autumn.autumn35_baidu.baidu01;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/28 7:55 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int x = 0, y = 0;
        for(char ch : chars){
            if(ch == 'R') {
                x++;
            } else if (ch == 'L') {
                x--;
            } else if(ch == 'U') {
                y++;
            } else if(ch == 'D') {
                y--;
            }
            if(x < 0){
                x  = 0;
            } if( y < 0){
                y = 0;
            }

        }
        System.out.println("(" + x + "," + y + ")");
    }
}
