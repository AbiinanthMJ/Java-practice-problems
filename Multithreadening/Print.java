package Multithreadening;

public class Print extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            try {
                System.out.println(i + "this is the process that's running in the Printing thread");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
