package written_examination.autumn.autumn01_NIO;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

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
public class NIO05_restoreIpAddresses_3 {
    public static ArrayList<String> restoreIpAddresses (String s) {
        int len = s.length();
        ArrayList<String> res = new ArrayList<>();
        if(len > 12 || len < 4){
            return res;
        }
        Deque<String> path = new ArrayDeque<>(4);
        dfs(s, len, 0, 4, path, res);
        return res;

    }

    private static void dfs(String s, int len, int begin, int dot_residue, Deque<String> path, ArrayList<String> res) {
        if(begin ==  len){
            if(dot_residue == 0){
                res.add(String.join(".", path));
            }
            return ;
        }
        for(int i = begin; i < begin + 3; i++){
            if(i >= len){
                break;
            }
            if(dot_residue * 3 < len - i){
                continue;
            }
            if(judgeIpSegment(s, begin, i)){
                String cur_ip = s.substring(begin, i+1);
                path.addLast(cur_ip);

                dfs(s, len, i+1, dot_residue - 1, path, res);
                path.removeLast();
            }

        }
    }

    private static boolean judgeIpSegment(String s, int left, int right) {
        int len = right - left + 1;
        if(len > 1 && s.charAt(left) == '0'){
            return false;
        }
        int res = 0;
        while(left <= right){
            res = res * 10 + s.charAt(left) - '0';
            left ++;
        }
        return res >= 0 && res <= 255;
    }
    public static void main(String[] args) {
        ArrayList<String> res = restoreIpAddresses("25525511135");
//        ArrayList<String> res = restoreIpAddresses("0000");
        System.out.println(res);
    }


}
