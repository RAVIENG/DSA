import java.util.*;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "Hello";

        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }

        String rev = "";
        while(!s.isEmpty()){
            rev += s.pop();
        }

        System.out.println("Reversed String: " + rev);
    }
}
