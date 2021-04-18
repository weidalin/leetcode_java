package leetcode.backtrack.leetcode401_readBinaryWatch;



import java.util.ArrayList;
import java.util.List;

/**
 * 401. 二进制手表
 * 二进制手表顶部有 4 个 LED 代表 小时（0-11），底部的 6 个 LED 代表 分钟（0-59）。
 *
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 */
public class ReadBinaryWatch_2 {


    /*
     vector<string>res;
    unordered_map<int,int> hash={{0,1},{1,2},{2,4},{3,8},{4,1},{5,2},{6,4},{7,8},{8,16},{9,32}};
    void backtrack(int num,int start,pair<int,int>& time)
    {
        if(num==0)
        {
            if(time.first>11||time.second>59)//判断合法性
                return;
            string temp_hour=to_string(time.first);
            string temp_minute=to_string(time.second);
            if(temp_minute.size()==1)//如果minute只有一位要补0
                temp_minute.insert(0,"0");
            res.push_back(temp_hour+":"+temp_minute);//构造格式
            return;
        }

        for(int i=start;i<10;i++)
        {
            if(time.first>11||time.second>59)
                continue;
            pair<int,int>store=time;//保存状态
            if(i<4)
                time.first+=hash[i];
            else
                time.second+=hash[i];
            backtrack(num-1,i+1,time);//进入下一层，注意下一层的start是i+1，即从当前灯的下一盏开始
            time=store;//恢复状态
        }
    }
    vector<string> readBinaryWatch(int num) {
        pair<int,int>time(0,0);//初始化时间为0:00
        backtrack(num,0,time);
        return res;
    }

作者：show-me-the-code-2
链接：https://leetcode-cn.com/problems/binary-watch/solution/czong-jie-liao-hui-su-wen-ti-lei-xing-dai-ni-gao-d/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param args
     */




    /**
     * 执行用时：
     * 21 ms
     * , 在所有 Java 提交中击败了
     * 8.44%
     * 的用户
     * 内存消耗：
     * 38.8 MB
     * , 在所有 Java 提交中击败了
     * 46.55%
     * 的用户
     * @param num
     * @return
     */
    //Integer.bitCount()
    //bitCount实现的功能是计算一个（byte,short,char,int统一按照int方法计算）int,long类型的数值在二进制下“1”的数量。
    public static List<String> readBinaryWatchV2(int num){
        List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++){
            for(int m=0; m<60; m++){
                if (Integer.bitCount(h) + Integer.bitCount(m) == num){
                    times.add(String.format("%d:%02d", h,m));
                }
            }
        }
        return times;

    }
    public static void main(String[] args) {
        List<String> res = readBinaryWatchV2(4);
        System.out.println(res);
    }
}
