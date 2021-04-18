package written_examination.meituan.current_hot;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 美团 2021春招 技术综合-算法方向在线考试
 * 编程题|20.0分1/4
 * 小美的实时热搜
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 小美被上司委派开发一个实时热搜的榜单。该榜单需要支持以下几种操作：
 *
 * 操作1：接收到某条新闻的热度提升了多少，更新数据库，并调整榜单排行。初始时，数据库中不存在任何新闻。
 *
 * 操作2：接收到用户的查询操作，返回热度最高的十条新闻。若此时数据库中新闻不足十条，那么有几条输出几条即可。例如此时数据库中只有三个新闻，则只需要返回热度最高的三条新闻。当两条新闻热度相同时，新闻编号小的在前。特别地，当数据库中没有任何新闻时，需要给出null。
 *
 * 现在你需要协助小美完成开发工作
 *
 *
 *
 * 输入描述
 * 第一行一个正整数n，表示接下来有n条操作。（1<= n <= 100000）
 *
 * 接下来n行，每行是两种操作中的一种：
 *
 * append x y ：其中x和y是两个正整数，表示接收到新闻x的热度提升了y。（新闻编号x的范围是[1,1000]，单次热度提升y的范围是[1,1000]）
 *
 * query : 用户向你发来查询。
 *
 * 输出描述
 * 对于每条用户查询，输出最高的十条新闻，以空格分隔。不足十条时，有几条输出几条。没有新闻时，输出null。每条查询的输出占一行。
 *
 *
 * 样例输入
 * 9
 * query
 * append 1 10
 * query
 * append 2 20
 * query
 * append 3 15
 * query
 * append 1 10
 * query
 * 样例输出
 * null
 * 1
 * 2 1
 * 2 3 1
 * 1 2 3
 */
public class Main {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 1; i++){
            String command = sc.next();
            if(command.equals("append")){
                int x  = sc.nextInt();
                int y  = sc.nextInt();
                map.put(x, map.getOrDefault(x,0) + y);
            }else{

                HashMap<Integer, Integer> tmp = (HashMap<Integer, Integer>) map.clone();
                if(tmp.size() == 0){
                    System.out.println("null");
                }else{
                    query(tmp, 10);
                }
            }
        }
    }

    private static void query(HashMap<Integer, Integer> map, int k) {
        if(map.size() == 0){
            return;
        }
        int max_key = -1, max_value = -1;
        for(int key : map.keySet()){
            if (map.get(key) > max_value){
                max_key = key;
            }
        }
        System.out.print(max_key);
    }
}
/**

1
append 1 10
1
query



 */
