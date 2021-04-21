package written_examination.weizong;

import java.util.Scanner;

/**
 * Cheems征服山巅
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 现在有n座山从左到右排成一排，每座山有自己的海拔h[i]，Cheems想要通过爬山来征服这几座山峰，当Cheems站在一座山的山巅，向左看没有山的海拔高度高于当前的山的高度，向右看也没有一座山能高于当前这座山，Cheems的征服感就会增加1。求问当Cheems征服了这几座山巅之后获得的征服感为多少。
 *
 *
 *
 * 输入描述
 * 第一行包括一个正整数n，表示山峰的数量。
 *
 * 第二行有n个正整数，其中第i个数代表第i座山顶的海拔h[i]
 *
 * 1≤h[i]≤100000
 *
 * 输出描述
 * 一个整数，表示答案，cheems获得的征服感
 *
 *
 * 样例输入
 * 5
 * 3 2 1 2 3
 * 样例输出
 * 2
 */
public class Get_Cheems {
    public static void main(String[] args){
        int cheems = get_cheems();
        System.out.print(cheems);
    }
    public static int get_cheems(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //input
        if(n <= 1)
            return n;
        int[] h = new int[n];
        int highest = -1;
        int cheems = 0;
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            if(highest < h[i]){
                highest = h[i];
                cheems = 1;
            }else if (h[i] == highest){
                cheems += 1;
            }
        }
        return cheems;
    }
}
