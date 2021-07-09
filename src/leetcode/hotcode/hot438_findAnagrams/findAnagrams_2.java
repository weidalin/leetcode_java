package leetcode.hotcode.hot438_findAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. 找到字符串中所有字母异位词
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
 *
 * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 *
 * 说明：
 *
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 * 示例 1:
 *
 * 输入:
 * s: "cbaebabacd" p: "abc"
 *
 * 输出:
 * [0, 6]
 *
 * 解释:
 * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
 * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 */
public class findAnagrams_2 {
    /**
     * 超时！！！
     * @param s
     * @param p
     * @return
     */
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> cur_map = new HashMap<>();
        int cur_map_size = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                cur_map = new HashMap<>();
                cur_map_size = 0;
            }else{
                cur_map_size++;
                cur_map.put(ch, cur_map.getOrDefault(ch, 0) + 1);
            }
            if(cur_map_size == p.length() && map.equals(cur_map)){
                res.add(i);
                i = i + cur_map_size - 1;
                cur_map = new HashMap<>();
                cur_map_size = 0;
            }else if(cur_map_size == p.length()){
                i = i + cur_map_size - 1;
                cur_map = new HashMap<>();
                cur_map_size = 0;
            }
        }
        return res;
    }
}
