package written_examination.autumn.autumn32_qianxin_AK.qianxin01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linweida
 * 2021/9/23 3:50 下午
 */

public class Main {
    public static int DoPermute (int M, int N) {
        // write code here
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            list.add(i);
        }
        int realIdx = 0;
        while(list.size() > 1){
            realIdx = (realIdx + M - 1) % list.size();
            list.remove(realIdx);
            M++;

        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int res = DoPermute(3, 5);
        System.out.println(res);
    }
}
