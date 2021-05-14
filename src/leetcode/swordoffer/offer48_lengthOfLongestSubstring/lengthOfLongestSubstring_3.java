package leetcode.swordoffer.offer48_lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 *
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class lengthOfLongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        //dp[i] = dp[i-1] + 1   dp[j-1] < j - i
//              = j - i         dp[j-1] >= j - i
        int tmp = 0;
        int res = 0;
        for(int j = 0; j < s.length(); j++){
            int i = map.getOrDefault(ch[j], -1);
            map.put(ch[j], j);
            tmp = tmp < j - i ? tmp + 1 : j - i;
            res = Math.max(tmp, res);
        }
        return res;
    }
    /**
     * 时间复杂度 O(N)O(N) ： 其中 NN 为字符串长度，动态规划需遍历计算 dpdp 列表。
     * 空间复杂度 O(1)O(1) ： 字符的 ASCII 码范围为 00 ~ 127127 ，哈希表 dicdic 最多使用 O(128) = O(1)O(128)=O(1) 大小的额外
     *
     * 作者：jyd
     * 链接：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/solution/mian-shi-ti-48-zui-chang-bu-han-zhong-fu-zi-fu-d-9/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
