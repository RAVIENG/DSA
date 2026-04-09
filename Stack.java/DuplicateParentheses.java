import java.util.*;
public class DuplicateParentheses {
    public static boolean duplicateExist(Stack<Character> s,String str){

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch==')'){
                int count  = 0;
                while(!s.isEmpty()&&s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "((a+b)+(a-b))))))";

        System.out.println(duplicateExist(s, str));
    }
}
