package leetcode.sliding_window.slide567_checkInclusion;

/**
 * 567. 字符串的排列
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 *
 * 换句话说，第一个字符串的排列之一是第二个字符串的 子串 。
 *
 *
 *
 * 示例 1：
 *
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 * 示例 2：
 *
 * 输入: s1= "ab" s2 = "eidboaoo"
 * 输出: False
 */
public class checkInclusion_1 {
    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if(n > m)   return false;

        int[] cnt = new int[128];
        for (char ch : s1.toCharArray()) {
            cnt[ch]++;
        }
        int l = 0, r = 0;
        while(r < s2.length()) {
            int ch = s2.charAt(r);
            cnt[ch]--;
            while(cnt[ch] < 0){
                cnt[s2.charAt(l)]++;
                l++;
            }
            if(r - l + 1 == n){
                return true;
            }
            r++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidaaoo";
        boolean res = checkInclusion(s1,s2);
        System.out.println(res);
    }
}
