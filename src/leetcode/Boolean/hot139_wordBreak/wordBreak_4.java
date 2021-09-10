package leetcode.Boolean.hot139_wordBreak;

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
public class wordBreak_4 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] visited = new Boolean[s.length()];
        boolean res = dfs(s, 0, wordDict, visited);
        return res;
    }

    private static boolean dfs(String s, int i, List<String> wordDict, Boolean[] visited) {
        // 全部查找完成
        if(i == s.length()){
            return true;
        }
        // 从当前start是否可以直接找到最后，不等于null，说明已经查找过了，直接利用之前的结果visited[i]
        if(visited[i] != null){
            return visited[i];
        }
        for(int j = i+1; j <= s.length(); j++){
            // 当前单词 s[i:j] 包含在字典表中，并且一路查下去，都能找到,那么返回true
            if(wordDict.contains(s.substring(i, j)) && dfs(s, j, wordDict, visited)){
                visited[i] = true;
                return true;
            }
        }
        visited[i] = false;
        return false;
    }
}
/**
 时间复杂度：O(n^2)，因为可以利用之前的结果，最多只是进行双重 for 循环。
 空间复杂度为：O(n)，这个和之前一样的。
 */