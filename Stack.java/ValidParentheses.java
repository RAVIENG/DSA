public class ValidParentheses {

    public static boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            // Remove valid bracket pairs repeatedly
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        } while (length != s.length());
 
        return s.isEmpty();//isEmpty() returns true only when the string length is 0.
    }

    public static void main(String[] args) {
        String str1 = "{()}";
        String str2 = "([}{";

        System.out.println(isValid(str1)); // true
        System.out.println(isValid(str2)); // false
    }
}
