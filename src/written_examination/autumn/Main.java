package written_examination.autumn;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/26 8:21 下午
 */

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        findMaxSubStr("123", 2);
    }
    private static void findMaxSubStr(String str, int len) {
        int i = 0, j = len;
        String tmp = str.substring(i,j);
        String res = tmp;

        while(j < str.length()+1){
            tmp = str.substring(i,j);
            if(tmp.compareTo(res) > 0){
                res = tmp;
            }
            i++;
            j++;
        }
        System.out.println(res);
    }
}
