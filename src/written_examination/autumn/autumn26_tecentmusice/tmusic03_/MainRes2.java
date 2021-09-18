package written_examination.autumn.autumn26_tecentmusice.tmusic03_;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author linweida
 * 2021/9/16 7:13 下午
 */

public class MainRes2 {

    public static void main(String[] args) {
        long res = minM(100, 10);
//        long res = minM(5, 3);
        System.out.println(res);
    }

    public static long minM (int n, int k) {
        // write code here
        int curSum = 0;
        ArrayList<Long> dp = new ArrayList<>();
        dp.add(0L);
        int i = 1;
        while(curSum < n){
            if(i % k == 1){
                dp.add(dp.get(dp.size() - 1) + 1);
            }else{
                dp.add(dp.get(dp.size()/k));
            }
            curSum += dp.get(dp.size() -1);
            i++;
        }
        return i-1;
    }

}
/*
5,3
5
10, 10
17
 */
