package leetcode.sliding_window.slide76_minWindow;

import java.util.Locale;

/**
 *
 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 注意：如果 s 中存在这样的子串，我们保证它是唯一的答案。

 示例 1：

 输入：s = "ADOBECODEBANC", t = "ABC"
 输出："BANC"
 示例 2：

 输入：s = "a", t = "a"
 输出："a"
 */
public class minWindow_1 {
    public String minWindow(String s, String t) {
        if(s == null || s.length() == 0 || t == null || t.length() == 0)    return "";
        int l = 0, r = 0, size = Integer.MAX_VALUE, start = 0, count = t.length();
        int[] cnt = new int[128];
        for(char c : t.toCharArray()){
            cnt[c]++;
        }
        while(r < s.length()){
            char ch = s.charAt(r);
            // 1. 需要ch
            if(cnt[ch] > 0){
                count --;
            }
            cnt[ch] --;
            // 2. 满足条件，l右移动
            if(count == 0){
                while(l < r && cnt[s.charAt(l)] < 0){
                    cnt[s.charAt(l)]++;
                    l++;
                }

                if(r - l + 1 < size){
                    size = r - l + 1;
                    start = l;
                }
                cnt[s.charAt(l)] ++;
                l++;
                count++;
            }
            r++;
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
    }
}
