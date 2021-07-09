package leetcode.hotcode.hot208_Trie;

public class Trie {

    class TireNode{
        private boolean isEnd;
        TireNode[] next;

        public TireNode(){
            isEnd = false;
            next = new TireNode[26];
        }
    }

    private TireNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TireNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TireNode node = root;
        for(char c : word.toCharArray()){
            if(node.next[c - 'a'] == null){
                node.next[c-'a'] = new TireNode();
            }
            node = node.next[c - 'a'];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TireNode node = root;
        for(char ch : word.toCharArray()){
            node = node.next[ch-'a'];
            if(node == null){
                return false;
            }
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TireNode node = root;
        for(char ch : prefix.toCharArray()){
            node = node.next[ch - 'a'];
            if(node == null){
                return false;
            }
        }
        return true;
    }
}
