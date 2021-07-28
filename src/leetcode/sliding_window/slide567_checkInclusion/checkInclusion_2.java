package leetcode.sliding_window.slide567_checkInclusion;

import java.util.Arrays;

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
public class checkInclusion_2 {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if(n > m){
            return false;
        }
        int[] cnt1 = new int[128];
        int[] cnt2 = new int[128];
        for(int i = 0; i < n; i++){
            cnt1[s1.charAt(i)]++;
            cnt1[s1.charAt(i)]++;
        }
        if(Arrays.equals(cnt1, cnt2)){
            return true;
        }
        for(int i = n; i < m; i++){
            cnt2[s2.charAt(i)]++;
            cnt2[s2.charAt(i - n)]--;
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
        }
        return false;
    }
}
