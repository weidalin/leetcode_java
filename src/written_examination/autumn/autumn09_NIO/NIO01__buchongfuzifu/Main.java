package written_examination.autumn.autumn09_NIO.NIO01__buchongfuzifu;

import java.util.HashMap;

/**
 * @author linweida
 * 2021/8/28 7:24 下午
 */
// 100%
public class Main {
    public int lengthOfLongestSubstring (String s) {
        // write code here
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){ // 获取子串起始位置
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1); // 每次计算子串长度
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
