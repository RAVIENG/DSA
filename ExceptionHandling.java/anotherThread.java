// Thread by extending Thread class
class ExtenThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(500); // Pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class anotherThread { // Class name should not be Thread
    public static void main(String[] args) {
        ExtenThread ex = new ExtenThread();
        ex.start(); // Start the thread

      
    }
}
