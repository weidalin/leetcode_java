package written_examination.autumn.autumn28_wanmeishijie.wanmei02;

import java.util.Arrays;

/**
 * @author linweida
 * 2021/9/18 3:10 下午
 */

// 70%
public class Main {
    public static void main(String[] args) {
//        2,[1,2,3,4,5,6,7,8],1
        int res = maxProfit(2, new int[]{1,2,3,4,5,6,7,8}, 1);
        System.out.println(res);
    }
    public static int maxProfit (int k, int[] prices, int fee) {
        // write code here
        if (prices.length == 0){
            return 0;
        }
        int n = prices.length;
        k = Math.min(k, n/2);
        int[][] buy = new int[n][k+1];
        int[][] sell = new int[n][k+1];

        buy[0][0] = -prices[0];
        sell[0][0] = 0;
        for (int i =1; i <= k; i++){
            buy[0][i] = sell[0][i] = Integer.MIN_VALUE / 2;
        }
        for (int i=1; i<n; i++){
            buy[i][0] = Math.max(buy[i-1][0], sell[i-1][0] - prices[i] - fee);
            for (int j=1; j <= k; j++){
                buy[i][j] = Math.max(buy[i-1][j], sell[i-1][j] - prices[i]);
                sell[i][j] = Math.max(sell[i-1][j], buy[i-1][j-1] + prices[i] - fee);
            }
        }
        return Arrays.stream(sell[n-1]).max().getAsInt();
    }

}
