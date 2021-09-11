package written_examination.autumn.autumn15_shunfeng_OK.shunfeng01_no1;

import java.util.Scanner;

public class MainAnswer2 {
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
//        作者：712酱
//        链接：https://www.nowcoder.com/discuss/733632?type=post&order=time&pos=&page=2&ncTraceId=&channel=-1&source_id=search_post_nctrack
//        来源：牛客网
        for(int i=0;i*111<=num;i++){
            if((num-i*111)%11==0){
                return true;
            }
        }
        return false;
    }
}
/*

3
33 144 69

输出2

 */