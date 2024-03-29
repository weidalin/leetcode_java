package written_examination.autumn.autumn01_NIO;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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
public class NIO05_restoreIpAddresses {
    static List<String> res;
    public static List<String> restoreIpAddresses(String s) {
        res = new ArrayList<>();
        if(s.length() > 12 || s.length() < 4)
            return res;
        Deque<String> path = new ArrayDeque<>();
        dfs(0, 0, s, path);
        return res;
    }
    public static void dfs(int i, int dot, String s, Deque<String> path){
        if(i == s.length()){
            if(dot == 4){
                res.add(String.join(".", path));
            }
            return;
        }
        for(int j = i; j < i + 3; j++){
            if(j >= s.length())
                break;
            if(judgeIP(s, i, j)){
                path.addLast(s.substring(i, j + 1));
                dfs(j + 1, dot + 1, s, path);
                path.removeLast();
            }
        }
    }
    public static boolean judgeIP(String s, int i, int j){
        if(j - i > 0 && s.charAt(i) == '0'){
            return false;
        }
        int cur_num = 0;
        while(i <= j){
            cur_num = cur_num * 10 + s.charAt(i) - '0';
            i++;
        }
        return cur_num >= 0 && cur_num <= 255;
    }

    public static void main(String[] args) {
        List<String> res = restoreIpAddresses("25525511135");
//        ArrayList<String> res = restoreIpAddresses("0000");
        System.out.println(res);
    }


}
