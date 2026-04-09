// Thread by extending Thread class
class ExtenThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Thread using Runnable
class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(1000); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class AnotherThreadDemo{
    public static void main(String[] args) { 
        ExtenThread ex = new ExtenThread();
        ex.start(); // Start Thread1

        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start(); // Start Thread2
    }
}

