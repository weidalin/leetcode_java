package written_examination.autumn.autumn08_weizong.weizong02_sanjiaoxinglujing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/27 9:14 下午
 */
// 没过
public class Main {
    static int[] res_min;
    static int[] res_max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List> list = new ArrayList();
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i < n; i++){
            List<String> tmp = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                tmp.add(sc.nextLine());
            }
            list.add(tmp);
        }
        System.out.println(list);

        res_min = new int[n];
        res_max = new int[n];

        Arrays.fill(res_min, Integer.MAX_VALUE);
        Arrays.fill(res_max, Integer.MIN_VALUE);

        dfs(list,0, 1, 0);
        for(int num : res_min){
            System.out.print(num + " ");
        }
        System.out.println("\b");
        for(int num : res_max){
            System.out.print(num + " ");
        }
        System.out.println("\b");

    }

    private static void dfs(List<List> list, int layer, int cur, int col) {
        // 1. 函数出口
        if(layer == list.size()){
            if(cur > res_max[col]){
                res_max[col] = cur;
            }
            if(cur < res_min[col]){
                res_min[col] = cur;
            }
            return;
        }
        List<String> tmp = list.get(layer);

        // 2. 遍历下一层
        String opr1 = tmp.get(col);
        String opr2 = tmp.get(col + 1);
        dfs(list, layer + 1, oprNmu(cur, opr1), col);
        dfs(list, layer + 1, oprNmu(cur, opr2), col+1);
    }

    private static int oprNmu(int cur, String opr) {
        if(opr.startsWith("+")){
            return cur + Integer.parseInt(opr.split(" ")[1]);
        }else if (opr.startsWith("-")){
            return cur - Integer.parseInt(opr.split(" ")[1]);
        }else if(opr.startsWith("/")){
            return cur / Integer.parseInt(opr.split(" ")[1]);
        }else if(opr.startsWith("s")){
            return (int) Math.sqrt(cur);
        }else if(opr.startsWith("n")){
            return cur * -1;
        }else{
            return 0;
        }
    }
}
/*

3
+ 2
n
/ 2
- 5
s


 */
