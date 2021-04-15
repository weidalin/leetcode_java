package leetcode.swordoffer.offer50_firstUniqChar;

import java.util.*;

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
public class firstUniqChar_1 {
    public char firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(char ch : s.toCharArray()){
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for(char ch : s.toCharArray()){
            if(count.get(ch) == 1){
                return ch;
            }
        }
//        LinkedHashSet<Character> keys = (LinkedHashSet<Character>) count.keySet();
//        for(Character key : keys){
//            if(count.get(key) == 1){
//                return key;
//            }
//        }
        return ' ';
//        List<Character> list = new ArrayList<>();
//        for(char ch : s.toCharArray()){
//            if(list.contains(ch)){
//                list.remove(list.indexOf(ch));
//                list.remove(ch);
//            }else{
//                list.add(ch);
//            }
//        }
//        if(list.size() > 0){
//            return list.get(0);
//        }
//        return ' ';
    }
}
