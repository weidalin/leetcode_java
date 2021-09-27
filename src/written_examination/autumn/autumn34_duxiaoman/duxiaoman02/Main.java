package written_examination.autumn.autumn34_duxiaoman.duxiaoman02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/26 4:04 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int removeA = 1;
        int removeB = 1;
        while (list.size() > 1) {
            removeB--;
            // remove a
            removeA = (a + removeB) % list.size();

            System.out.println(removeA-1);
            list.remove(removeA);

            if(list.size() == 1) break;
            // removeB
            removeA--;
            removeB = (b-a + removeA) % list.size();

            System.out.println(removeB-1);
            list.remove(removeB);
        }
        System.out.println(list.get(0));
    }
}
/*
6 3 5
 */
