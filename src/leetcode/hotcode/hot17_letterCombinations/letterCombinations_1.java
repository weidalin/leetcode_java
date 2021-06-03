package leetcode.hotcode.hot17_letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 示例 1：
 *
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 *
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 *
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 */
public class letterCombinations_1 {
    private String letterMap[] = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    private ArrayList<String> res;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if(digits.equals("")){
            return res;
        }
        letterCombinations_helper(digits, 0, "");
        return res;

    }

    private void letterCombinations_helper(String digits, int idx, String s) {
        if(idx == digits.length()){
            res.add(s);
            return;
        }
        Character c = digits.charAt(idx);
        String letters = letterMap[c - '0'];
        for(int i = 0; i < letters.length(); i++){
            letterCombinations_helper(digits, idx+1, s + letters.charAt(i));
        }
    }
}
