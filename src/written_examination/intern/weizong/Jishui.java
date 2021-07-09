package written_examination.intern.weizong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 小A所在的城市下了暴雨，有些地方积水了。小A所在的城市十分神奇，它有n个蓄水池，依次标号为分别蓄水1,...n，
 *
 * 分别蓄水a1,...an，它们都处于同一水平高度，水池底部有一些管道与其他的水池相连，之前都处于关闭状态，现在要把它们同时打开。不考虑水的蒸发等流失，认为管道中不会有残留。水池上部是开放的，我们认为相连通的所有水池最终都会有相同的蓄水量，且蓄水量之和不会增加或减少。
 *
 *
 *
 * 输入描述
 * 第一行两个数n和m，分别表示蓄水池数量和管道数
 *
 * 第二行n个数a1,...an，分别表示第1,...n个水池的当前蓄水量（此时所有管道还没有打开）。
 *
 * 接下来m行，每行两个数u，v，表示第u个水池和第v个水池相连通。
 *
 * 1≤n，m≤105，1≤ai≤106，1≤u，v≤n，保证没有重边、自环。
 *
 * 输入均为整数。
 *
 * 输出描述
 * 输出n个数，a1,...an分别表示从1,...n个蓄水池在打开所有管道稳定后的蓄水量。保留小数点后两位，四舍五入。
 *
 *
 * 样例输入
 * 5 3
 * 1 6 4 5 2
 * 1 2
 * 2 3
 * 4 5
 * 样例输出
 * 3.67 3.67 3.67 3.50 3.50
 */
public class Jishui{
    public static void main(String[] args){
        jishui();
    }
    public static void jishui(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("");
        int linked1 = 0, linked2 = 0;
        Set<Set> store_set = new HashSet<>();
        for(int i = 0; i < m; i++){
            linked1 = sc.nextInt();
            linked2 = sc.nextInt();
            Set<Integer> set = new HashSet<Integer>();
            set.add(linked1);
            set.add(linked2);

            boolean stored = false;
            for(Set set_item : store_set){
                if (set_item.contains(linked1) || set_item.contains(linked2)){
                    set_item.addAll(set);
                    stored = true;
                }
            }
            if (stored == false)
                store_set.add(set);
        }
//        System.out.println(store_set);
        float[] res = new float[n];
        for(Set<Integer> set_item : store_set){
            int sum = 0;
//            System.out.println(set_item);
            for(int index : set_item) {
                sum += a[index-1];
            }

            for(int index : set_item) {
                res[index-1] = (float)sum / (float)set_item.size();
            }
        }
        for (int index = 0; index < n; index++)
            System.out.print(String.format("%.2f ",res[index]));
    }
}


/**

 5 3
 1 6 4 5 2
 1 2
 2 3
 4 5



 */
