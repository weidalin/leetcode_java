package written_examination.intern.Ctrip.Ctrip1_huochezhongzhuan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 题目描述：
 * 现有n个火车站（2≤n≤50）用编号1~n表示，彼此之间的通车情况用字符串 "a,b" 表示，如："2,3" 表示有一条2号车站到3号车站的单程线路。现随意给出两个车站序号 x、y 和 最大途经中转站个数 k（0≤k≤n-2），要求计算出 x 到 y 最多中转 k 次的所有线路数量（同一站点不可重复经过）。
 *
 * 输入描述
 * 第一行为车站数量 n
 *
 * 第二行表示通车情况，线路之间用空格分隔，如1,2 2,3
 *
 * 第三行为指定两个车站序号 x y
 *
 * 第四行为最大中转次数 k
 *
 * 输出描述
 * x 到 y 最多经过 k 个中转站的所有线路数量
 *
 * 如输入样例数据，计算出 1->3 最多经过1个中转站的线路为：1->2->3 和 1->3
 *
 * 样例输入
 * 3
 * 1,2 2,3 1,3
 * 1 3
 * 1
 * 样例输出
 * 2
 */
public class Main {
    static int res ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        int x = sc.nextInt(), y = sc.nextInt();
        int max_tmp = sc.nextInt();

        HashMap<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        String[] strs = line.split(" ");
        for(String str : strs){
            String[] tmp = str.split(",");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            Set<Integer> set = map.getOrDefault(a, new HashSet<>());
            set.add(b);
            map.put(a, set);

//            Set<Integer> set0 = map.getOrDefault(b, new HashSet<>());
//            set0.add(a);
//            map.put(b, set0);
        }
//        System.out.println(map);

        res = 0;
        Set<Integer> set = new HashSet<>();
        set.add(x);
        dfs(0, max_tmp + 1, x, y, map, set);
        System.out.println(res);
    }

    private static void dfs(int i, int max_tmp, int x, int y, HashMap<Integer, Set<Integer>> map, Set<Integer> set) {
        if(i > max_tmp){
            return;
        }if(x == y){
            res ++;
            return;
        }
        for(Integer key : map.get(x)){
            if(set.contains(key)){
                continue;
            }else{
                set.add(key);
                dfs(i + 1, max_tmp, key, y, map, set);
                set.remove(key);
            }

        }
    }
}
/*

3
1,2 2,3 1,3
1 3
1

 */
/**
 说明：
 所有测试数据正确率为 40%！
 可以尝试再次完善代码，并调试，争取全部AC通过

 温馨提示：有时候，申请大的全局数组会导致超时，如果有此类情况，请检查您的全局数组是否超过题目要求的内存大小。
 排除这个错误后，再检查别的情况引起的超时错误：例如死循环、循环结束条件错误等，或者需要更好的算法！
 */