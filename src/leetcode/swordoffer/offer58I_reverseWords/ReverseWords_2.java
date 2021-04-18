package leetcode.swordoffer.offer58I_reverseWords;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 *
 *
 * 示例 1：
 *
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 *
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 *
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
public class ReverseWords_2 {
    public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int str_len = strs.length;
        for(int i = 0; i < str_len; i++){
            if (!strs[str_len - i - 1].equals("")){
                sb.append(strs[str_len - i - 1] + " ");
            }
        }
        String res = sb.toString();
        if(res.equals("")){
            return "";
        }
        return res.substring(0, res.length()-1);
    }
}
/**
 * 执行用时：
 * 2 ms
 * , 在所有 Java 提交中击败了
 * 92.34%
 * 的用户
 * 内存消耗：
 * 38.5 MB
 * , 在所有 Java 提交中击败了
 * 21.28%
 * 的用户
 */
