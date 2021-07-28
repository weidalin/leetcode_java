package leetcode.hotcode.hot3_lengthOfLongestSubstring;

import java.util.HashMap;

public class lengthOfLongestSubstring_1 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){ // 获取子串起始位置
                // 这里为什么要用left呢？？？
                // 需要每次更新 left，left代表当前没有重复子串的起始位置
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1); // 每次计算子串长度
        }
        return max;
    }
}
