package written_examination.tx.tx2_faguanggao;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**https://www.nowcoder.com/discuss/643658?type=post&order=time&pos=&page=1&channel=-1&source_id=search_post_nctrack
 * 发广告
 */
public class Main_ac {

    public static void main(String[] args){
        HashMap<Integer, Integer> id_time = new HashMap<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] customer_time = new int[n];
        for(int i = 0; i < n; i++){
            customer_time[i] = sc.nextInt();
            queue.add(customer_time[i]);
        }
        while(k-- > 0){

        }

    }
}

/**
3 5
3
6
9
 */