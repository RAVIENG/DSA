//using runnabe or using thread
class mythread implements Runnable{
    public void run(){
        for(int i=10;i<0;i--){
            System.out.println("runnable thread :"+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}
public class ThreadDemo{
    public static void main(String[] args) {
        
         mythread t = new mythread();
        Thread th = new Thread(t);
        th.start();
    }  
}
