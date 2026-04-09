public class WordBreak {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
    }

    static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean wordBreak(String s) {
        if (s.length() == 0) {
            return true;
        }

        for (int i = 1; i <= s.length(); i++) {
            if (search(s.substring(0, i)) &&
                wordBreak(s.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] dict = {"i", "like", "sam", "samsung", "mobile"};
        for (String word : dict) {
            insert(word);
        }

        String s = "ilikesamsung";
        System.out.println(wordBreak(s)); // true
    }
}

