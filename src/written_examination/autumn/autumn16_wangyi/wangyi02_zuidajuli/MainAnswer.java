package written_examination.autumn.autumn16_wangyi.wangyi02_zuidajuli;

/**
 * @author linweida
 * 2021/9/10 9:44 上午
 */

import java.util.Scanner;
import java.util.Stack;

/**
 * 疫情逐步缓和后，电影院终于开业了，但是由于当前仍处于疫情期间，应尽量保持人群不聚集的原则。
 * 所以当小易来电影院选定一排后，尽量需要选择一个远离人群的位置。
 * 已知由0和1组成的数组表示当前排的座位情况,其中1表示已被选座，0表示空座
 * 请问小易所选座位和最近人的距离座位数最大是多少？
 * 有如下假设：至少有一个人已选座，至少有一个空座位，且座位数限制为
 *
 * 输入描述:
 * 一行由0和1组成的整数数组
 *
 *
 * 输出描述:
 * 仅一行一个整数表示答案
 *
 * 输入例子1:
 * 1 0 0 0 1 0 1
 *
 * 输出例子1:
 * 2
 */

public class MainAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int lBound = strs.length-1, rBound = 0;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].equals("1")){
                lBound = i;
                break;
            }
        }
        for(int i = strs.length-1; i >= 0; i--){
            if(strs[i].equals("1")){
                rBound = i;
                break;
            }
        }
        int res = Math.max(lBound, strs.length - rBound-1);
        Stack<Integer> stack = new Stack<>();
        for(int i = lBound; i < rBound + 1; i++){
            if(strs[i].equals("1")){
                if(!stack.isEmpty()){
                    int dis = i - stack.pop();
                    res = Math.max(res, dis/2);
                }
                stack.push(i);
            }
        }
        System.out.println(res);
    }
}
/*
0 0 0 0 0 0 1 1

6

1 0 0 0 1 0 1
2
 */