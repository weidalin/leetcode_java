package written_examination.autumn.autumn01_NIO;

import java.util.ArrayList;

/**
 * 原题：ip地址
 * https://leetcode-cn.com/problems/restore-ip-addresses/
 * 还原成ip地址
 * 93. 复原 IP 地址
 * 给定一个只包含数字的字符串，用以表示一个 IP 地址，返回所有可能从 s 获得的 有效 IP 地址 。你可以按任何顺序返回答案。
 *
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
 *
 * 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
 *
 * 示例 1：
 *
 * 输入：s = "25525511135"
 * 输出：["255.255.11.135","255.255.111.35"]
 * 示例 2：
 *
 * 输入：s = "0000"
 * 输出：["0.0.0.0"]
 * 示例 3：
 *
 * 输入：s = "1111"
 * 输出：["1.1.1.1"]
 * 示例 4：
 *
 * 输入：s = "010010"
 * 输出：["0.10.0.10","0.100.1.0"]
 * 示例 5：
 *
 * 输入：s = "101023"
 * 输出：["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 *
 */
public class NIO05_restoreIpAddresses_2 {
    static String str;
    static ArrayList<String> res;
    static int len;
    public static ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        str = s;
        res = new ArrayList<>();
        dfs(0, 0, "", 0);
        return res;
    }

    private static void dfs(int i, int index_dot, String tmp, int cur_sum) {
        if(i == str.length() && index_dot == 3 && cur_sum <= 255){
            res.add(tmp);
        }
        if(i >= str.length() || cur_sum > 255 || index_dot > 3){
            return;
        }

        // 加.或者加字符ch
        // 1 加.
        if(cur_sum >= 0){
            dfs(i, index_dot+1, tmp+".", 0);
        }
        // 2 加字符
        char ch = str.charAt(i);
        cur_sum = cur_sum*10 + Integer.parseInt(ch+"");
        dfs(i+1, index_dot, tmp + ch, cur_sum);
    }

    public static void main(String[] args) {
        ArrayList<String> res = restoreIpAddresses("1111");
        System.out.println(res);
    }

}
