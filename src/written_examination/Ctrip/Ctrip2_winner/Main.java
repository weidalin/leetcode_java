package written_examination.Ctrip.Ctrip2_winner;

/**
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 某互联网公司举办年会，一共有9种奖品（分别用编号为1～9的数字来表示），有m名员工去参加年会，每名员工在参加年会时都会随机抽取一个奖品编号，组成一个长度为m的抽奖序列s。
 *
 * 抽奖的时候主持人会随机抽取n个1～9的数字组成中奖序列t（t中元素可重复）。中奖规则如下：
 *
 * 1、如果抽奖序列s中某个子序列s'包含了中奖序列t中所有的奖品，则称s'为涵盖中奖序列t的有效子序列，s中会存在0个或者多个有效子序列s'，其中长度最短的有效子序列称为最小子序列
 *
 * 2、获奖者为最小子序列中起始位置编号（编号从1开始）最小的员工
 *
 * 3、如果抽奖序列s中不存在涵盖中奖序列t的有效子序列，则没有任何一个人中奖
 *
 * 例如：假设抽奖序列s为[1,2,5,4,3,4,7,1,4,9,3,1]，中奖序列为[3,1,4]，其中：
 *
 * 1、抽奖序列s（[1,2,5,4,3,4,7,1,4,9,3,1]）中1,2,5,4,3为一个子序列s'，长度为5
 *
 * 2、抽奖序列s（[1,2,5,4,3,4,7,1,4,9,3,1]）中3,4,7,1为一个子序列s'，长度为4
 *
 * 3、抽奖序列s（[1,2,5,4,3,4,7,1,4,9,3,1]）中4,9,3,1为一个子序列s'，长度为4
 *
 * 起始位置编号最小的最小子序列为3,4,7,1，其起始位置编号为5，所以获奖者的编号为5
 *
 *
 *
 * 输入描述
 * 一共分为两行，第一行是长度为m的抽奖序列s，第二行是长度为n的中奖序列t，序列中的各奖品用“,”分割
 *
 * 输出描述
 * 获奖者的编号，下标从1开始，如果没有人中奖则输出0
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int real_i, real_j;
    static int winner(int[] s, int[] t) {

        int i = 0, j = s.length - 1;
        real_i = 0;
        real_j = s.length;

        LinkedList<Integer> list_s = new LinkedList<>();
        LinkedList<Integer> list_t = new LinkedList<>();
        for(int num_s : s){
            list_s.add(num_s);
        }
        for(int num_t : t){
            list_t.add(num_t);
        }

        while(list_s.containsAll(list_t)){
            System.out.println(list_s);
            LinkedList tmp = new LinkedList(list_s);
            Integer last = list_s.removeLast();
            if(list_s.containsAll(list_t)){
                j--;
            }else{
                list_s.addLast(last);
                Integer first = list_s.removeFirst();
                i++;
            }
        }
        return i;
    }

    /*
1,2,5,4,3,4,7,1,4,9,3,1
1,1
    */


    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[]values=line.split(",");
        int[]s=new int[values.length];
        for(int i=0;i<values.length;i++){
            s[i] = Integer.parseInt(values[i]);
        }

        line = scanner.nextLine();
        values=line.split(",");
        int[]t=new int[values.length];
        for(int i=0;i<values.length;i++){
            t[i] = Integer.parseInt(values[i]);
        }

        res = winner(s, t);
        System.out.println(String.valueOf(res));
    }
}

