package problems;

class TrieNode {
    TrieNode[] letters = new TrieNode[26];
    boolean isWord = false;
}
public class trie {
    TrieNode root = new TrieNode();
    public void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            int idx = c - 'a';

            if (current.letters[idx] == null) {
                current.letters[idx] = new TrieNode();
            }

            current = current.letters[idx];
        }

        current.isWord = true;
    }
    public boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            int idx = c - 'a';

            if (current.letters[idx] == null) {
                return false; // letter not found
            }

            current = current.letters[idx];
        }

        return current.isWord;
    }
    public static void main(String[] args) {
        trie trie = new trie();
        trie.insert("Abiinanth");
        trie.insert("Abi");
        trie.insert("Abiram");
        System.out.println(trie.search("Abi"));
        System.out.println(trie.search("Abiram"));
        System.out.println(trie.search("Abiina"));
        System.out.println(trie.search("Abiinanth"));
        System.out.println(trie.search("abi"));
    }
}
