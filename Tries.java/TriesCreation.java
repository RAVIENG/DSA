public class TriesCreation {
    static class Node {
        Node[] children = new Node[26];
        boolean eow ;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;//this thing also done automatically
            }
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) -'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

           curr =  curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }

            curr = curr.children[idx];
        }
        return curr.eow;
    }
    public static void main(String[] args) {
        String word[] = {"the" ,"a" ,"there" ,"their" ,"any" ,"thee"};

        for(int i=0; i<word.length ;i++){
            insert(word[i]);
        }

        System.out.println(search("the"));
    }
}
