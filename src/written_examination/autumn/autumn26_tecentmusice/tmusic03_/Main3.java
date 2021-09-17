package written_examination.autumn.autumn26_tecentmusice.tmusic03_;

/**
 * @author linweida
 * 2021/9/16 7:13 下午
 */

public class Main3 {

    public static void main(String[] args) {
        long res = minM(5, 3);
        System.out.println(res);
    }

    public static long minM (int n, int k) {
        // write code here
        int curSum = 0;

        for(int i = 0; i < Integer.MAX_VALUE; i++){
            curSum += basekK(i, k);
            if(curSum >= n){
                return i;
            }
        }
        return -1;
    }

    private static int basekK(int n, int k) {
        int res = 0;
        while(n!=0){
            int yushu = n % k;
            if(yushu == 1){
                res++;
            }
            n = n / k;
        }
        return res;
    }
}
/*
5,3
5
 */
