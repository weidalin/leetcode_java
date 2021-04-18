package leetcode.backtrack.leetcode401_readBinaryWatch;



import java.util.ArrayList;
import java.util.List;

/**
 401. 二进制手表
 二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。

 每个 LED 代表一个 0 或 1，最低位在右侧。



 （图源：WikiMedia - Binary clock samui moon.jpg ，许可协议：Attribution-ShareAlike 3.0 Unported (CC BY-SA 3.0) ）

 例如，上面的二进制手表读取 “3:25”。

 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。



 示例：

 输入: n = 1
 返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]


 提示：

 输出的顺序没有要求。
 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
 超过表示范围（小时 0-11，分钟 0-59）的数据将会被舍弃，也就是说不会出现 "13:00", "0:61" 等时间。
 */
public class ReadBinaryWatch_1 {
    // 小时最多有3个，分钟最多有5个
    public static List<String> readBinaryWatch(int num) {
        List<String> ans = new ArrayList<>();
        if(num >= 9) return ans;
        //first 3
        for(int i = 0; i <= 3; i++) {
            if(num - i > 5) continue;
            List<String> h = new ArrayList<>();
            dfs(i, 0, 0, new int[4], h);//小时 new int[4] --> {0,0,1,1} 表示0011即3
            List<String> m = new ArrayList<>();
            dfs(num - i, 0, 0, new int[6], m);//分钟

            for(String hh : h) {
                for(String mm : m) {
                    if(mm.length() == 1) {
                        mm = "0" + mm;
                    }
                    ans.add(hh + ":" + mm);
                }
            }
        }
        return ans;
    }

    public static void dfs(int num, int idx, int cnt, int[] arr, List<String> res) {
        //1.结束dfs条件
        if(cnt == num) {
            StringBuilder sb = new StringBuilder();
            //{0,0,1,1} --> '0011'
            for(int val : arr) {
                sb.append(val);
            }
            int tmp = Integer.parseInt(sb.toString(), 2);//将二进制字符换成int,如parseInt("1100110", 2) returns 102
            if((tmp > 11 && arr.length == 4) || (tmp > 59 && arr.length == 6)) return;
            res.add(Integer.toString(tmp));
            return;
        }
        //2.选择列表中不停选择值并遍历
        for(int i = idx; i < arr.length; i++) {
            //2.1选择他
            arr[i] = 1;
            //2.2进一步dfs
            dfs(num, i + 1, cnt + 1, arr, res);
            //2.3撤销选择
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        List<String> res = readBinaryWatch(1);
        System.out.println(res);
    }
}
