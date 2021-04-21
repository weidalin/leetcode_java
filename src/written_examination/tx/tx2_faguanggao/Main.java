package written_examination.tx.tx2_faguanggao;

import java.util.Scanner;

/**https://www.nowcoder.com/discuss/643658?type=post&order=time&pos=&page=1&channel=-1&source_id=search_post_nctrack
 * 发广告
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] customer_time = new int[n];
        for(int i = 0; i < n; i++){
            customer_time[i] = sc.nextInt();
        }
        int time = 1;
        int count = 0;
        while(count < k){
            for(int j = 0; j < n; j++) {
                if (time % customer_time[j] == 0 && count < k) {
                    count++;
                    System.out.println(j + 1);
                }
            }
            time ++;
        }
    }
}

/**
3 5
3
6
9
 */