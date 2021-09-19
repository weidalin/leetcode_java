package written_examination.autumn.autumn27_xiaohongshu.xioahongshu03_;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/18 10:19 上午
 */
// AC
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "56CD";
        str.toUpperCase();
        String hstring = "0123456789ABCDEF";
        BigDecimal res = new BigDecimal(0);
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int n = hstring.indexOf(ch);
            if(n == -1){
                System.out.println();
            }
            res = res.multiply(new BigDecimal(16)).add(new BigDecimal(n));
        }
        System.out.println(res);
    }
}
/*
56CD
22221
 */
