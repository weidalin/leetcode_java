package written_examination.autumn.autumn12_mi.mi01_;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/1 7:53 下午
 */
//100%
public class Main {
    // 整数列表求三的倍数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 5;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        int cur = 0;
        int i = 0;
        while(list.size() > 1){
            i %= list.size();
            cur ++;
            if(cur % 3 == 0){
                list.remove(i);
                i--;
            }
            i++;
        }
        System.out.println(list.get(0));
    }
}
