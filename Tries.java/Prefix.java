public class Prefix {

    static class Node{
        Node children[] = new Node[26];
        boolean eow;
        int freq;

        Node(){
            freq = 1;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node word, String ans){
        if(word == null){
            return;
        }

        if(word.freq == 1){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < 26; i++){
            if(word.children[i] != null){
                findPrefix(word.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"zebra", "dog", "duck", "dove"};

        for(String w : words){
            insert(w);
        }

        root.freq = -1;
        findPrefix(root, "");
    }
}
