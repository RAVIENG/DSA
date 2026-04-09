class Company {
    int n;
    boolean f = false;

    synchronized public void produce_item(int n){
        if(f){
            try{ wait(); } catch(Exception e){}
        }
        this.n = n;
        System.out.println("item produced " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item(){
        if(!f){
            try{ wait(); } catch(Exception e){}
        }
        System.out.println("item consumed " + this.n);
        f = false;   // FIXED
        notify();
        return this.n;
    }
}

class Producer extends Thread {
    Company c;
    Producer(Company c){
        this.c = c;
    }

    int i = 1;

    public void run(){
        while(true){
            c.produce_item(i);
            try{ Thread.sleep(1000); } catch(Exception e){}
            i++;
        }
    }
}

class Consumer extends Thread {
    Company c;
    Consumer(Company c){
        this.c = c;
    }

    public void run(){
        while(true){
            c.consume_item();
            try{ Thread.sleep(1000); } catch(Exception e){}
        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String args[]){
        Company cmp = new Company();
        Producer p = new Producer(cmp);
        Consumer c = new Consumer(cmp);
        p.start();
        c.start();
    }
}
