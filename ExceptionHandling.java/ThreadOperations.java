public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Thread Start ... ");
        System.out.println(5+9+5+6);
        System.out.println("Thread end ....");
         
        Thread t = Thread.currentThread();
        System.out.println("current thread :"+t.getName());
        t.setName("myMAIN");
        System.out.println(t.getName());
    }
}
