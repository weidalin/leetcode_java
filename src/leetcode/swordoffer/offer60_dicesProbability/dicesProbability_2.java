package leetcode.swordoffer.offer60_dicesProbability;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 60. n个骰子的点数
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
 *
 *
 *
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
 *
 *
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
 * 示例 2:
 *
 * 输入: 2
 * 输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778]
 *
 *
 * 限制：
 */
public class dicesProbability_2 {
    static Map<Integer, Double> map;
    public static double[] dicesProbability(int n) {
        if(n == 0){
            return new double[0];
        }
        map = new HashMap<>();
        dfs(0, 0, n);
        double sum = 0;
        for(int i : map.keySet()){
            sum += map.get(i);
        }
        double[] res = new double[map.size()];
        int size = map.size();
        for(int key :map.keySet()){
            res[--size] = map.get(key) / sum;
        }
        return res;
    }

    private static void dfs(int idx, int sum, int n) {
        if(idx == n){
            map.put(sum, map.getOrDefault(sum, 0.0) + 1);
            return;
        }
        for(int i = 1; i <= 6; i++){
            dfs(idx + 1, sum + i, n);
        }
    }
}
/**
 超时
 */