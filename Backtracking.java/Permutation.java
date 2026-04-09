public class Permutation {
    public static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1); // rest of string
            printPermutation(ros, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}
