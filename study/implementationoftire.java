package study;

public class implementationoftire {
    class tirenode {
        //        we are this class as we do the same in the linked list
        //         and using the constructor of this class to acess the store of data areas
        boolean isaword;
        tirenode[] childern;

        tirenode() {
            isaword = false;
            childern = new tirenode[26];
        }
    }

    tirenode root = new tirenode();

    public void insert(String word) {
        tirenode node = root;
        for (char c : word.toCharArray()) {
            if (node.childern[c - 'a'] == null) {
                node.childern[c - 'a'] = new tirenode();
            }
            node = node.childern[c - 'a'];
        }
        node.isaword = true;
    }

    public boolean search(String word) {
        tirenode node = root;
        for (char c : word.toCharArray()) {
            if (node.childern[c - 'a'] == null) {
                return false;
            }
            node = node.childern[c - 'a'];
        }
        return node.isaword;
    }

    public static void main(String[] args) {
        implementationoftire trie = new implementationoftire();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.search("bat"));
        System.out.println(trie.search("bad"));
        System.out.println(trie.search("appl"));
    }
}
