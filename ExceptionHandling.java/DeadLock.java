class ProcessA extends Thread {
    public void run() {
        synchronized (DeadLock.x) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            }
            synchronized (DeadLock.y) {
                System.out.println("Process A is Complete");
            }
        }
    }
}

class ProcessB extends Thread {
    public void run() {
        synchronized (DeadLock.y) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("error: " + e.getMessage());
            }
            synchronized (DeadLock.x) {
                System.out.println("Process B is Complete");
            }
        }
    }
}

public class DeadLock {
    public static final Object x = new Object();
    public static final Object y = new Object();

    public static void main(String[] args) {
        ProcessA processA = new ProcessA();
        ProcessB processB = new ProcessB();

        processA.start();
        processB.start();
    }
}
