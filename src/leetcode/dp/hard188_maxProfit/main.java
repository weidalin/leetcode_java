package leetcode.dp.hard188_maxProfit;

import static leetcode.hard.hard188_maxProfit.maxProfit_1.maxProfit;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 2;

        //#############################################################################################
        int res = maxProfit(k, nums);
        System.out.print(res);
    }
}