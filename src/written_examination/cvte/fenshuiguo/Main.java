package written_examination.cvte.fenshuiguo;

/**
 * 给定n个水果，每个水果都有一个重量，分成两堆，怎么分才使得分得的重量差值最小？
 * 5
 * 10 20 30 10 10
 * Sample Output
 * 0
 */
public class Main {
    public static int sub(int[] prices){
        return dfs(0, prices, 0, 0);
    }

    private static int dfs(int i, int[] prices, int p_a, int p_b) {
        if(i == prices.length){
            return Math.abs(p_a - p_b);
        }
        return Math.min(dfs(i + 1, prices, p_a + prices[i], p_b), dfs(i + 1, prices, p_a , p_b + prices[i]));
    }
    public static void main(String[] args){
        int res = sub(new int[]{11,20,30,10,10});
        System.out.println(res);
    }
}
