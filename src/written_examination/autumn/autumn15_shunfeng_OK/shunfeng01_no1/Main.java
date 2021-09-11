package written_examination.autumn.autumn15_shunfeng_OK.shunfeng01_no1;

/**
 * @author linweida
 * 2021/9/6 8:32 下午
 */

import java.util.Scanner;

/**
 * 小明小时候生病的时候打针次数比较多，所以他在学数学的时候，看到1就感觉很厌恶，回想起不堪回首的经历。他很讨厌很多1的数字，更严重的是，如果一个数字x可以通过一些11,111,1111,11111,…，相加得到，那么小明也会很讨厌这个数字。
 *
 * 例如：22=11+11, 122=111+11, 111111233=111111111+111+11
 *
 * 那么小明就会讨厌22，122，111111233。现在给你一些数字，你知道小明一共讨厌其中多少个数字么？
 */
public class Main {
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        res = 0;
        for(int i = 0; i < n; i++){
            int cur = sc.nextInt();
            func1(cur);
        }
        System.out.println(res);
    }

    private static void func1(int num) {
        while(true){
            int bitNum = getBit(num);
            int oneNum = 0;
            for(int i = 0; i < bitNum; i++){
                oneNum = oneNum * 10 + 1;
            }
            if(num < oneNum){
                oneNum = (int) oneNum / 10;
            }
            num -= oneNum;
            if(num == 0){
                res ++;
                break;
            }if(num<0){
                break;
            }
        }
    }

    private static int getBit(int num) {
        int res = 0;
        while(num != 0){
            res += 1;
            num = num / 10;
        }
        return res;
    }
}
/*
3
33 144 69

输出2
 */

