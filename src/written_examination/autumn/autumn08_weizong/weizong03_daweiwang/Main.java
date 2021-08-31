package written_examination.autumn.autumn08_weizong.weizong03_daweiwang;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/27 8:25 下午
 */
// 100%
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        String str = sc.nextLine();
        for(int i = 1; i <= n; i++){
            pq.add(sc.nextInt());
        }
        int i = 1;
        int eat = 1;
        for( ; i <= n; i ++){
            if(pq.size() > 0 && pq.poll() < eat){
                continue;
            }
            eat++;
        }
        System.out.println(eat);
    }
}
/*

6
1 3 3 3 4 4
 */
