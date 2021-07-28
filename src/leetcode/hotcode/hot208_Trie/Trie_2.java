package leetcode.hotcode.hot208_Trie;

public class Trie_2 {

    class TrieNode{
        boolean isEnd;
        TrieNode[] next;
        public TrieNode(){
            isEnd = false;
            next = new TrieNode[26];

        }
    }
    /** Initialize your data structure here. */
    TrieNode root;
    public Trie_2() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        // System.out.print("node: " + node.next.equals(null));
        for(char ch : word.toCharArray()){
            if(node.next[ch - 'a'] == null){
                node.next[ch - 'a'] = new TrieNode();
            }
            node = node.next[ch-'a'];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            node = root.next[ch - 'a'];
            if(node == null){
                return false;
            }
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char ch : prefix.toCharArray()){
            node = root.next[ch - 'a'];
            if(node == null){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Trie_2 trie = new Trie_2();
        trie.insert("abc");
        System.out.println(trie);
    }
}
