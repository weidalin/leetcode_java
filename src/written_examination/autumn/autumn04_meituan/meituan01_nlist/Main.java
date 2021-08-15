package written_examination.autumn.autumn04_meituan.meituan01_nlist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author linweida
 * 2021/8/15 10:10 上午
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 小美给小团一个n个数字构成的数字序列，问小团能不能经过重新排列后形成1到n的排列。
 *
 * 举例：
 *
 * 小美给小团[2, 1, 3]，则可以经过重新排列后构成[1, 2, 3]，这是可行的。
 *
 * 小美给小团[4, 4, 1, 3]，则无法经过重新排列后构成[1, 2, 3, 4]，这是不可行的。
 *
 * 为了防止小团靠运气碰对答案，小美会进行多组询问。
 *
 * 第一行是一个数T，表示有T组数据。
 *
 * 对于每组数据：
 *
 * 第一行一个数字n表示小美给出的序列由n个数字构成。
 *
 * 接下来一行n个空格隔开的正整数。
 *
 * 输出描述
 * 对于每组数据，如果可以重新排列后得到1到n的排列，回答一行Yes，如果不可以，回答No
 *
 * 请注意大小写。
 */

/**

2
3
2 1 3
4
4 4 1 3

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            String[] str_list = str.split(" ");
            Set<String> set = new HashSet<>();
            for (String str_item : str_list){
                if(set.contains(str_item) || Integer.parseInt(str_item) > n || Integer.parseInt(str_item) < 0){
                    System.out.println("no");
                    break;
                }
                set.add(str_item);
            }
            if(set.size() == n){
                System.out.println("yes");
            }
        }
    }
}
// 100% accepted