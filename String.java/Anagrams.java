import java.util.*;
import java.util.Arrays;

public class Anagrams {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       
       System.out.println("enter first string ");
        String str1 = sc.nextLine();

        System.out.println("enter secound string");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result = Arrays.equals(str1Array, str2Array);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }

        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
        sc.close();
    }
}
