package written_examination.autumn.autumn20_bytedance.bytedance03_defendAttack;

/**
 * @author linweida
 * 2021/9/13 3:46 下午
 */

import java.math.BigDecimal;

/**
 * 题目描述
 * 一个数组ai表示防御值，一个数组bi表示进攻值，ai的乘积能被bi的乘积整除，输出yes，反之输出no。
 *
 * 思路就是质因数分解， 一个数大于另一个数 那么这个数的质因数分解的幂大于等于另一个数质因数分解的幂
 */
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1,Integer.MAX_VALUE,Integer.MAX_VALUE};
        int[] b = new int[]{1,2};
        boolean bool = func(a, b);
        System.out.println(bool);
    }

    private static boolean func(int[] a, int[] b) {
        BigDecimal sumA = new BigDecimal(1);
        BigDecimal sumB = new BigDecimal(1);
        for(int aa : a){
            sumA = sumA.multiply(new BigDecimal(aa));
        }
        for(int bb : b){
            sumB = sumB.multiply(new BigDecimal(bb));
        }
        BigDecimal[] res = sumA.divideAndRemainder(sumB);
        System.out.println(res[0]);
        System.out.println(res[1]);
        return res[1].compareTo(BigDecimal.ZERO)==0;
    }
}
