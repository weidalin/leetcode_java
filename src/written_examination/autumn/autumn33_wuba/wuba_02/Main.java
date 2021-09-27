package written_examination.autumn.autumn33_wuba.wuba_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/9/25 7:55 下午
 */

public class Main {
    public static void main(String[] args) {
        int nums[][] = new int[][]{{1,3,2},{4,5,6},{9,8,7}};
        int ans[] = rec(nums);
        print_arr(ans);
    }
    public static int[] rec (int[][] results) {
        // write code here
        List<Integer> ans  = new ArrayList<Integer>();

        for (int[] result : results) {
            for (int res : result){
                if(!ans.contains(res)) {
                    ans.add(res);
                }
            }
        }
        ans.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }});
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
