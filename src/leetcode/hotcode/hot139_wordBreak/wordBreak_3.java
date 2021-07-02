package leetcode.hotcode.hot139_wordBreak;

import java.util.List;

/***
 * 139. 单词拆分
 * 给定一个非空字符串 s 和一个包含非空单词的列表 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 *
 * 说明：
 *
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 *
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 *
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 * 示例 3：
 *
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 */
public class wordBreak_3 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] visited = new boolean[s.length() + 1];
        return dfs(s, 0, wordDict, visited);
    }

    private static boolean dfs(String s, int start, List<String> wordDict, boolean[] visited) {
        for(String word : wordDict){
            int nextStart = start + word.length();
            if(nextStart > s.length() || visited[nextStart]){
                continue;
            }
            if(s.indexOf(word, start) == start){
                if(nextStart == s.length() || dfs(s, nextStart, wordDict, visited)){
                    return true;
                }
                visited[nextStart] = true;
            }
        }
        return false;
    }
}
