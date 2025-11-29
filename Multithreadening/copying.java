package Multithreadening;

public class copying extends Thread { // it extends the threads class
    public void run(){
        for(int i=0;i<5;i++){
            try {
                System.out.println(i+"this is the process that's running in the copying threa");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
