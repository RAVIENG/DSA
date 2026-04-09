import java.util.*;

public class FirstNonRepeatingLatter {

    public static void firstNonRepeating(String stream) {

        int freq[] = new int[26];           
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);

            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String stream = "aabc";
        firstNonRepeating(stream);
    }
}
