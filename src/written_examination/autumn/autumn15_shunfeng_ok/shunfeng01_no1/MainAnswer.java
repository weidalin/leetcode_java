package written_examination.autumn.autumn15_shunfeng_ok.shunfeng01_no1;

import java.util.Scanner;

public class MainAnswer {
    /**
     * https://blog.csdn.net/xin_jun/article/details/117393947?utm_medium=distribute.pc_relevant.none-task-blog-2
     * @param args
     */
    // 11a + 111b = x
    // 11(a+10b)+b = x
    //b = x % 11
    // a + 10b <= x / 11 即 a <=  x / 11 - 10b
    // 设 b = x % 11,
    // 故当 x / 11 - 10 * (x % 11） >= 0时有解
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        res = 0;
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            res = func1(cur) ? res +1 : res;
        }
        System.out.println(res);
    }
    private static boolean func1(int num) {
        int y=num % 11;
        if(num/11 >= 10*y)
            return true;
        else
            return false;
    }
}
/*

3
33 144 69

输出2

 */