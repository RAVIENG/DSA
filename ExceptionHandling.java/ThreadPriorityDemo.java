class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running, count: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Create threads
        MyThread t1 = new MyThread("HIGH Priority Thread");
        MyThread t2 = new MyThread("MEDIUM Priority Thread");
        MyThread t3 = new MyThread("LOW Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MIN_PRIORITY);   // 1

        // Start threads
        t3.start();
        t2.start();
        t1.start();
    }
}
