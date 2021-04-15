package leetcode.swordoffer.offer50_firstUniqChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 */
public class firstUniqChar_2 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> count = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            count.put(ch, !count.containsKey(ch));
        }
        for(Map.Entry<Character, Boolean> d : count.entrySet()){
            if(d.getValue())
                return d.getKey();
        }
        return ' ';
    }
}
