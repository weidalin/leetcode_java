package written_examination.autumn.autumn26_tecentmusice.tmusic03_;

/**
 * @author linweida
 * 2021/9/16 7:13 下午
 */

public class Main2 {

    public static void main(String[] args) {
        long res = minM(10, 10);
        System.out.println(res);
    }

    public static long minM (int n, int k) {
        // write code here
        int curSum = 0;
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            String sss = Integer.toString(i, k);
            curSum += getAppear(sss);
            if(curSum >= n){
                return i;
            }
        }
        return -1;
    }

    private static int getAppear(String sss) {
        int res = 0;
        for(int i = 0; i < sss.length(); i++){
            if(sss.charAt(i) == '1'){
                res++;
            }
        }
        return res;
    }
}
/*
5,3
5
 */
