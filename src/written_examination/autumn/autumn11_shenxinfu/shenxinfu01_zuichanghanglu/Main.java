package written_examination.autumn.autumn11_shenxinfu.shenxinfu01_zuichanghanglu;

import java.util.*;

/**
 * @author linweida
 * 2021/8/31 4:06 下午
 */

/**
 *   API安全经常涉及业务场景建模，需要对偏离正常模式的操作进行告警。业务场景通常有一些固定的模式，比如购物场景下，最后两步操作通常都是确认订单、支付。如果一个操作序列（序列不要求连续）是所有用户所共有的，那么称这个序列为航路，序列上的每个操作称作航路点。现在给你很多用户的操作序列，序列里的操作序号是严格递增的，请计算最长航路的长度。
 * <p>  假如有三个用户的操作序列，分别是： </p>
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int t = 0; t < T; t++){ // T 组
            int K = sc.nextInt();
            sc.nextLine();
            List<List<Integer>> list = new ArrayList<>();   // K个序列
            Map<String , Integer> map = new HashMap<>();
            for(int k = 0; k < K; k++){
                String str = sc.nextLine();
                fillToMap(str, map);
            }
            int count = 0;
            for(String key : map.keySet()){
                if(map.get(key) >= K){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static void fillToMap(String str, Map<String, Integer> map) {
        String[] nums = str.split(" ");
        for(int i = 1; i < nums.length; i++){
            String num = nums[i];
            map.put(num, map.getOrDefault(num,0) + 1);
        }
    }
}
/*

1
3
5 1 2 3 5 6
6 1 3 4 6 7 8
5 1 3 4 5 6

//
shuchu 3

 */