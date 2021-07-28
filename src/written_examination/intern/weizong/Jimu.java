package written_examination.intern.weizong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 拼积木
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 小A正在拼积木！她拥有很多块积木，每块上有一个0~9的整数。小A玩腻了普通的积木，想试试有挑战性的，于是她给自己设定了这样的要求：
 * 拼出来一行积木，且其上的数字从左到右要能形成一个没有前导零的数字（例如123，5，0则没有前导零，而0123，05，00则含有前导零），
 * 并且那个数字要能被30整除。即，假设拼出来的数为X，则需要X%30==0满足。她觉得满足这样要求的数有很多，她只想拼出最大的那一个数。
 *
 * 请帮帮小A！
 *
 *
 *
 * 输入描述
 * 第一行一个整数T，表示数据组数。
 *
 * 接下来对每组数据，第一行有一个整数n，表示该组数据中小A拥有的积木数量。
 *
 * 接下来一行n个整数，a1,...,an，表示小A这n块积木上分别写的数字。
 *
 * 不同组数据之间相互独立。
 *
 * 1≤T，n≤105，aiϵ{0,1,...,9}，Σn≤105（即T组n之和不超过105）
 *
 * 输出描述
 * 对每组数据输出一行无前导零的数字，表示答案。如果无法拼出任何满足要求的数，则输出-1
 */
public class Jimu {
    public static void main(String[] args){
        jishui();
    }
    public static void jishui() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("");
        int linked1 = 0, linked2 = 0;
        Set<Set> store_set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            linked1 = sc.nextInt();
            linked2 = sc.nextInt();
        }
    }

}
