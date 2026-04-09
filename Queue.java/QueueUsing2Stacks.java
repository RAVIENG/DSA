import java.util.*;
class QueueUsing2Stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void add(int data) {
        s1.push(data);
    }

    public int remove() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        if (s2.isEmpty()) {   
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();    
    }

    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        if (s2.isEmpty()) {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
}
