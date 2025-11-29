package Multithreadening.multi;


import Multithreadening.copying;

class Table extends Thread{

    int n ;
    Table(int n){
        this.n=n;
    }
    @Override
    public void run(){
        for(int i=0;i<n;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class multithread {
    public static void main(String[] args) throws Exception {
        Table t = new Table(4);
        Table t2 = new Table(4);
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println("bye");
//        Thread t1 = new Thread(() -> t.printTable(3));
//        Thread t2 = new Thread(() -> t.printTable(4));
  /*      t1.start();
        t2.start();*/
    }
}
